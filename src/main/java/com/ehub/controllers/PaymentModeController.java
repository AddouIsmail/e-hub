package com.ehub.controllers;

import com.ehub.entities.Category;
import com.ehub.entities.PaymentMode;
import com.ehub.services.PaymentModeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ismail on 30/01/2016.
 */
@RestController
public class PaymentModeController {
    private PaymentModeService paymentModeService;

    public void setPaymentModeService(PaymentModeService paymentModeService) {
        this.paymentModeService = paymentModeService;
    }

    @RequestMapping(value = "/paymentModes",method = RequestMethod.GET)
    public Iterable listPaymentModes(){
        return paymentModeService.findAll();
    }
    @RequestMapping(value = "/paymentMode",method = RequestMethod.GET)
    public PaymentMode insertPaymentMode(@RequestBody PaymentMode paymentMode){
        return paymentModeService.insert(paymentMode);
    }
    @RequestMapping(value = "/paymentMode",method = RequestMethod.PUT)
    public PaymentMode updatePaymentMode(@RequestBody PaymentMode paymentMode){
        return paymentModeService.update(paymentMode);
    }
    @RequestMapping(value = "/paymentMode/{id}",method = RequestMethod.GET)
    public PaymentMode getPaymentModeById(@PathVariable String id){
        return paymentModeService.findById(id);
    }
    @RequestMapping(value = "/paymentMode/{id}",method = RequestMethod.DELETE)
    public Long deletePaymentModeById(@PathVariable String id){
        return paymentModeService.deleteById(id);
    }


}
