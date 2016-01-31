package com.ehub.controllers;

import com.ehub.entities.Category;
import com.ehub.entities.PaymentMode;
import com.ehub.services.PaymentModeService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ismail on 30/01/2016.
 */
@CrossOrigin
@RestController
@RequestMapping("/payementmode")
public class PaymentModeController {
    private PaymentModeService paymentModeService;
    public void setPaymentModeService(PaymentModeService paymentModeService) {
        this.paymentModeService = paymentModeService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable listPaymentModes(){
        return paymentModeService.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public PaymentMode insertPaymentMode(@RequestBody PaymentMode paymentMode){
        return paymentModeService.insert(paymentMode);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public PaymentMode updatePaymentMode(@RequestBody PaymentMode paymentMode){
        return paymentModeService.update(paymentMode);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PaymentMode getPaymentModeById(@PathVariable String id){
        return paymentModeService.findById(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Long deletePaymentModeById(@PathVariable String id){
        return paymentModeService.deleteById(id);
    }
}
