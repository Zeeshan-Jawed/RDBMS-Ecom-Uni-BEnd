package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.UserRoleDTO;
import com.uni.ecommerce.Model.UserRole;
import com.uni.ecommerce.Repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;

    public String saveUserRole(UserRoleDTO userRoleDTO){
        UserRole userRole= new UserRole();
        userRole.setId(userRoleDTO.getId());
        userRole.setRoleid(userRoleDTO.getRoleid());
        userRoleRepository.save(userRole);
        return "Record Successfully Saved";
    }

}
