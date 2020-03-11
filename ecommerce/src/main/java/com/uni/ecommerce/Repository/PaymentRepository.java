package com.uni.ecommerce.Repository;

import com.uni.ecommerce.Model.Order;
import com.uni.ecommerce.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PaymentRepository extends JpaRepository<Payment ,Long> {
}