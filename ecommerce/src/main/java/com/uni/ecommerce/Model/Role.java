package com.uni.ecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleid;
    private String name;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getRoleid() { return roleid; }

    public void setRoleid(Long roleid) { this.roleid = roleid; }
}
