package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.AppUserDTO;
import com.uni.ecommerce.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/appUser")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getAppUser(@RequestBody  AppUserDTO appUserDTO){
       return appUserService.saveUser(appUserDTO);
    }
}
