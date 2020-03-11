package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.OrderLineItemDTO;
import com.uni.ecommerce.Service.OrderLineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/orderlineitem")
public class OrderLineItemController {
    @Autowired
    OrderLineItemService orderLineItemService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getorderlineitem(@RequestBody OrderLineItemDTO orderLineItemDTO){
        return orderLineItemService.saveOrderLineItem(orderLineItemDTO );
    }

}
