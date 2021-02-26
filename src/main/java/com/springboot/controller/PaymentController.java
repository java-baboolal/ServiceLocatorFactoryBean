package com.springboot.controller;

import com.springboot.model.PaymentRequest;
import com.springboot.registry.PaymentService;
import com.springboot.registry.PaymentServiceLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PaymentController {

    @Autowired
    PaymentServiceLocator serviceLocator;

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentRequest request){

        PaymentService service = serviceLocator.getAwesomeService(request.getPaymentMethod());
        return service.pay(request);
        //return "Payment done!";
    }
}
