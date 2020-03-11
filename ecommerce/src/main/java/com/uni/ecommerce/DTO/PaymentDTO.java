package com.uni.ecommerce.DTO;

public class PaymentDTO {
    private Long id;
    private String paymenttype;
    private String date;
    private float amount;
    private  float discount;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getPaymenttype() { return paymenttype; }

    public void setPaymenttype(String paymenttype) { this.paymenttype = paymenttype; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public float getAmount() { return amount; }

    public void setAmount(float amount) { this.amount = amount; }

    public float getDiscount() { return discount; }

    public void setDiscount(float discount) { this.discount = discount; }
}
