package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.ItemsDTO;
import com.uni.ecommerce.Model.Items;
import com.uni.ecommerce.Repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    @Autowired
    ItemsRepository itemsRepository;
    public String saveItems(ItemsDTO itemsDTO){
        Items items=new Items();
        items.setId(itemsDTO.getId());
        items.setItemname(itemsDTO.getItemname());
        items.setUnitprice(itemsDTO.getUnitprice());
        items.setCatagories(itemsDTO.getCatagories());
        itemsRepository.save(items);
        return "Record Successfully Saved";
    }
}
