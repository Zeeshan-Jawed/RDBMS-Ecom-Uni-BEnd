package com.uni.ecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name = "orderlineitem")
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String quantity;
    private String price;
    private Float discount;
    private String total;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }

    public String getPrice() { return price; }

    public void setPrice(String price) { this.price = price; }

    public Float getDiscount() { return discount; }

    public void setDiscount(Float discount) { this.discount = discount; }

    public String getTotal() { return total; }

    public void setTotal(String total) { this.total = total; }
}
