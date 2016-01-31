package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ehub.entities.Category;
import com.ehub.entities.Order;
import com.ehub.services.OrderService;
@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {
	private OrderService orderService;
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@RequestMapping(method = RequestMethod.GET)
    public Iterable listOrders(){
	return orderService.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
    public Order insertOrder(@RequestBody Order order){
	return orderService.insert(order);
	}
	@RequestMapping(method = RequestMethod.PUT)
    public Order updateOrder(@RequestBody Order order){
	return orderService.update(order);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order getOrderById(@PathVariable String id){
	return orderService.findById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteOrderById(@PathVariable String id){
	return orderService.deleteById(id);
	}
}
