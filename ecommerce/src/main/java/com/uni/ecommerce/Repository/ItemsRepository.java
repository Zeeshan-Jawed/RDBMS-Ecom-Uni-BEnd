package com.uni.ecommerce.Repository;

import com.uni.ecommerce.Model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items , Long> {
}
