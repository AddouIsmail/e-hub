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
    public PaymentMode findById(String id) {
        return paymentModeRepository.findOne(id);
    }

    @Override
    public PaymentMode update(PaymentMode paymentmode) {
        return paymentModeRepository.save(paymentmode);
    }

	@Override
	public PaymentMode insert(PaymentMode paymentmode) {
		// TODO Auto-generated method stub
		return paymentModeRepository.insert(paymentmode);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return paymentModeRepository.deleteById(id);
	}
}
