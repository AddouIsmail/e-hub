package com.ehub.services;

import com.ehub.entities.PaymentMode;
import com.ehub.repositories.PaymentModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
public class PaymentModeServiceImpl implements PaymentModeService {

    private PaymentModeRepository paymentModeRepository;

    @Autowired
    public void setPaymentModeRepository(PaymentModeRepository paymentModeRepository) {
        this.paymentModeRepository = paymentModeRepository;
    }

    @Override
    public Iterable findAll() {
        return paymentModeRepository.findAll();
    }

    @Override
    public PaymentMode getProductById(String id) {
        return paymentModeRepository.findOne(id);
    }

    @Override
    public PaymentMode save(PaymentMode paymentmode) {
        return paymentModeRepository.save(paymentmode);
    }
}
