package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.UserRoleDTO;
import com.uni.ecommerce.Model.UserRole;
import com.uni.ecommerce.Service.OrderService;
import com.uni.ecommerce.Service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping(value ="/api/userrole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getuserrole(@RequestBody UserRoleDTO userRoleDTO){
        return userRoleService.saveUserRole(userRoleDTO);
    }
}
