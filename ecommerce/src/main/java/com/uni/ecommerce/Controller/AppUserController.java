package com.uni.ecommerce.Controller;

import com.uni.ecommerce.DTO.AppUserDTO;
import com.uni.ecommerce.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/appUser")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getAppUser(@RequestBody  AppUserDTO appUserDTO){
       return appUserService.saveUser(appUserDTO);
    }
    @RequestMapping(value="/get/",method = RequestMethod.GET)
    public String fetchAppUser(){
        return "Working";
    }
}
