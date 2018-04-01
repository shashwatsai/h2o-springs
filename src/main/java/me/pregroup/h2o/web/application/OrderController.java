package me.pregroup.h2o.web.application;


import me.pregroup.h2o.business.domain.BottleBooking;
import me.pregroup.h2o.business.service.BottleBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private BottleBookingService bottleBookingService;

    @RequestMapping(method = RequestMethod.GET)
    public String getOrders(@RequestParam(value = "date", required = false)String dateString, Model model){
        List<BottleBooking> bottleBookings = this.bottleBookingService.getOrdersForDate(dateString);
        model.addAttribute("bottleBookings", bottleBookings);
        return "orders";
    }

}

