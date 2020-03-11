package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.ItemsDTO;
import com.uni.ecommerce.Model.Items;
import com.uni.ecommerce.Service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public  String getitems(@RequestBody ItemsDTO itemsDTO){
        return itemsService.saveItems(itemsDTO);
    }
}
