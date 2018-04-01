package me.pregroup.h2o.web.service;


import me.pregroup.h2o.business.domain.BottleBooking;
import me.pregroup.h2o.business.service.BottleBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class OrderApiController {

    @Autowired
    private BottleBookingService bottleBookingService;

    @RequestMapping(method = RequestMethod.GET, value = "/orders/{date}")
    public List<BottleBooking> getAllOrdersForDate(@PathVariable(value ="date")String dateString){
        return this.bottleBookingService.getOrdersForDate(dateString);
    }
}
