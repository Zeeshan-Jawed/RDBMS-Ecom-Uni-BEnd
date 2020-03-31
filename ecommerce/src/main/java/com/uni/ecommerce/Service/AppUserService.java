package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.AppUserDTO;
import com.uni.ecommerce.Model.AppUser;
import com.uni.ecommerce.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    AppUserRepository appUserRepository;

    public String saveUser(AppUserDTO appUserDTO){
        AppUser appUser = new AppUser();
        appUser.setAddress(appUserDTO.getAddress());
        appUser.setContactNo(appUserDTO.getContactNo());
        appUser.setEmail(appUserDTO.getEmail());
        appUser.setName(appUserDTO.getName());
        appUser.setPassword(appUserDTO.getPassword());
        appUser.setRegisterdate(appUserDTO.getRegisterdate());
        appUserRepository.save(appUser);
        return "Record Successfully Saved";
    }
}
