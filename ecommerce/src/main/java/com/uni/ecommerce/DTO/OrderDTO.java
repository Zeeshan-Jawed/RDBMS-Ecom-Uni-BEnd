package com.uni.ecommerce.DTO;

public class OrderDTO {
    private Long orderid;
    private Long orderno;
    private String date;
    private Long quantity;
    private Long totalitem;
    private Long totalvalue;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotalitem() {
        return totalitem;
    }

    public void setTotalitem(Long totalitem) {
        this.totalitem = totalitem;
    }

    public Long getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Long totalvalue) {
        this.totalvalue = totalvalue;
    }
}
