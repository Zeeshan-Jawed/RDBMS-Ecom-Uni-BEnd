package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.PaymentDTO;
import com.uni.ecommerce.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getpayment(@RequestBody PaymentDTO paymentDTO){
        return paymentService.savePayment(paymentDTO);
    }

}
