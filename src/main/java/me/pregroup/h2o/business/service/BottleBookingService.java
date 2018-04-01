package me.pregroup.h2o.business.service;

import me.pregroup.h2o.business.domain.BottleBooking;
import me.pregroup.h2o.data.entity.Bottle;
import me.pregroup.h2o.data.entity.Buyer;
import me.pregroup.h2o.data.entity.Order;
import me.pregroup.h2o.data.repository.BottleRepository;
import me.pregroup.h2o.data.repository.BuyerRepository;
import me.pregroup.h2o.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BottleBookingService {

    private BuyerRepository buyerRepository;
    private OrderRepository orderRepository;
    private BottleRepository bottleRepository;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public BottleBookingService(BottleRepository bottleRepository, BuyerRepository buyerRepository, OrderRepository orderRepository){
        this.bottleRepository = bottleRepository;
        this.buyerRepository = buyerRepository;
        this.orderRepository = orderRepository;
    }

    public List<BottleBooking> getOrdersForDate(String dateString){
        Date date = this.createDateFromDateString(dateString);
        Iterable<Bottle> bottles = this.bottleRepository.findAll();
        Map<Long, BottleBooking> bottleBookingHashMap = new HashMap<>();
        bottles.forEach(bottle -> {
            BottleBooking bottleBooking = new BottleBooking();
            bottleBooking.setBottleId(bottle.getId());
            bottleBooking.setBottleBrand(bottle.getBottleBrand());
            bottleBookingHashMap.put(bottle.getId(), bottleBooking);
        });

        Iterable<Order> orders = this.orderRepository.findByDate(new java.sql.Date(date.getTime()));
        if (null!= orders){
            orders.forEach(order -> {
                Optional<Buyer> buyer = this.buyerRepository.findById(order.getBuyerId());

                if(buyer.get()!=null){
                    BottleBooking bottleBooking = bottleBookingHashMap.get(order.getBottleId());
                    bottleBooking.setBuyerId(order.getBuyerId());
                    bottleBooking.setFirstName(buyer.get().getFirstName());
                    bottleBooking.setLastName(buyer.get().getLastName());
                    bottleBooking.setDate(date);
                    bottleBooking.setOrderQuantity(order.getOrderQuantity());
                }
            });
        }

        List<BottleBooking> bottleBookings = new ArrayList<>();
        for (Long bottleId: bottleBookingHashMap.keySet()){
            bottleBookings.add(bottleBookingHashMap.get(bottleId));
        }

        return bottleBookings;

    }

    private Date createDateFromDateString(String dateString){
        Date date = null;
        if(dateString != null){
            try{
                date = DATE_FORMAT.parse(dateString);
            }catch(ParseException pe){
                date = new Date();
            }
        }else{
            date = new Date();
        }

        return date;
    }
}
