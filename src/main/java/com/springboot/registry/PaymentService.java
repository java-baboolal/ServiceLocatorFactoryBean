package com.springboot.registry;

import com.springboot.model.PaymentRequest;

public interface PaymentService {
    String pay(PaymentRequest request);
}
