package com.uni.ecommerce.Service;

import com.uni.ecommerce.DTO.OrderDTO;
import com.uni.ecommerce.DTO.RoleDTO;
import com.uni.ecommerce.Model.Role;
import com.uni.ecommerce.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;
    public String saveRole(RoleDTO roleDTO){
        Role role=new Role();
        role.setName(roleDTO.getName());
        role.setRoleid(roleDTO.getRoleid());
        roleRepository.save(role);
        return "Record Successfully Saved";
    }
}
