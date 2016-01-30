package com.ehub.services;

import com.ehub.entities.PaymentMode;


public interface PaymentModeService {
    public Iterable findAll();
    public PaymentMode findById(String id);
    public PaymentMode insert(PaymentMode paymentmode);
    public PaymentMode update(PaymentMode paymentmode);
    public Long deleteById(String id);
}
