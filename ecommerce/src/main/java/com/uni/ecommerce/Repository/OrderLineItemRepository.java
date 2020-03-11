package com.uni.ecommerce.Repository;

import com.uni.ecommerce.Model.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Long> {
}
