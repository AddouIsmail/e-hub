package com.ehub.controllers;

import com.ehub.entities.PaymentMode;
import com.ehub.services.PaymentModeService;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/paymentMode/{id}",method = RequestMethod.GET)
    public PaymentMode getPaymentModeById(@PathVariable String id){
        return paymentModeService.getProductById(id);
    }

}
