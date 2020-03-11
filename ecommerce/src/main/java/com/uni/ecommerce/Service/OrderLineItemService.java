package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.OrderLineItemDTO;
import com.uni.ecommerce.Model.OrderLineItem;
import com.uni.ecommerce.Repository.OrderLineItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineItemService {
    @Autowired
    OrderLineItemRepository orderLineItemRepository;
    public String saveOrderLineItem(OrderLineItemDTO orderLineItemDTO){
        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setId(orderLineItemDTO.getId());
        orderLineItem.setQuantity(orderLineItemDTO.getQuantity());
        orderLineItem.setPrice(orderLineItemDTO.getPrice());
        orderLineItem.setDiscount(orderLineItemDTO.getDiscount());
        orderLineItem.setTotal(orderLineItemDTO.getTotal());
        orderLineItemRepository.save(orderLineItem);
                return "Record Successfully Saved";
    }
}
