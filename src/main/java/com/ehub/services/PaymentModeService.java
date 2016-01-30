package com.ehub.services;

import com.ehub.entities.PaymentMode;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface PaymentModeService {
    public Iterable findAll();

    public PaymentMode getProductById(String id);

    public PaymentMode save(PaymentMode paymentmode);
}
