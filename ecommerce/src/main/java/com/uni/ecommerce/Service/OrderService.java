package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.OrderDTO;
import com.uni.ecommerce.Model.Order;
import com.uni.ecommerce.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public String saveOrder(OrderDTO orderDTO){
        Order order = new Order();
        order.setOrderno(orderDTO.getOrderno());
        order.setDate(orderDTO.getDate());
        order.setQuantity(orderDTO.getQuantity());
        order.setTotalitem(orderDTO.getTotalitem());
        order.setTotalvalue(orderDTO.getTotalvalue());
        orderRepository.save(order);
        return "Record Successfully Saved";

    }

}
