package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.OrderDTO;
import com.uni.ecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getorder(@RequestBody OrderDTO orderDTO){

        return orderService.saveOrder(orderDTO);
    }
}
