package com.uni.ecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemname;
    private  String unitprice;
    private String Catagories;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getItemname() { return itemname; }

    public void setItemname(String itemname) { this.itemname = itemname; }

    public String getUnitprice() { return unitprice; }

    public void setUnitprice(String unitprice) { this.unitprice = unitprice; }

    public String getCatagories() { return Catagories; }

    public void setCatagories(String catagories) { Catagories = catagories; }
}
