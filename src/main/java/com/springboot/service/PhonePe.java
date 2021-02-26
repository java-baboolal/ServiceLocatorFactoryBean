package com.springboot.service;

import com.springboot.model.PaymentRequest;
import com.springboot.registry.PaymentService;
import org.springframework.stereotype.Service;

@Service("PhonePe")
public class PhonePe implements PaymentService {

    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount()+"Rs Payment has been successfully done by "+request.getPaymentMethod();
    }
}
