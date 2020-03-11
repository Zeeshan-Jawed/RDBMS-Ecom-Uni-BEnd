package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.RoleDTO;
import com.uni.ecommerce.Service.OrderService;
import com.uni.ecommerce.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getrole(@RequestBody RoleDTO roleDTO){
        return roleService.saveRole(roleDTO);
    }
}
