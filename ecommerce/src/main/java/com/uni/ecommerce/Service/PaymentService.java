package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.PaymentDTO;
import com.uni.ecommerce.Model.Payment;
import com.uni.ecommerce.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public String savePayment(PaymentDTO paymentDTO){
        Payment payment=new Payment();
        payment.setId(paymentDTO.getId());
        payment.setAmount(paymentDTO.getAmount());
        payment.setDate(paymentDTO.getDate());
        payment.setDiscount(paymentDTO.getDiscount());
        payment.setPaymenttype(paymentDTO.getPaymenttype());
        paymentRepository.save(payment);
        return "Record Successfully saved";
    }
}
