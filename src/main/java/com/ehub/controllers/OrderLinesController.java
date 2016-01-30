package com.ehub.controllers;

import com.ehub.entities.OrderLines;
import com.ehub.services.OrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ismail on 30/01/2016.
 */
@RestController
public class OrderLinesController {
    private OrderLinesService orderLinesService;

    @Autowired
    public void setOrderLinesService(OrderLinesService orderLinesService) {
        this.orderLinesService = orderLinesService;
    }

    @RequestMapping(value = "/orderLines",method = RequestMethod.GET)
    public Iterable listOrderLines(){
       return orderLinesService.findAll();
    }

    @RequestMapping(value="/orderLine/{id}",method = RequestMethod.GET)
    public OrderLines getOrderLineById(@PathVariable String id){
        return orderLinesService.getProductById(id);
    }

    @RequestMapping(value = "/saveOrderLine",method = RequestMethod.POST)
    public OrderLines saveOrderLines(@RequestBody OrderLines orderLines){
        return orderLinesService.save(orderLines);
    }
}
