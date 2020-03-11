package com.uni.ecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name = "userrole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long roleid;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public long getRoleid() { return roleid; }

    public void setRoleid(Long roleid) { this.roleid = roleid; }
}
