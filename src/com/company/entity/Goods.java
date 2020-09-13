package com.company.entity;


public class Goods {

    private int id;
    private String name;
    private String weight;
    private int amount;
    private boolean refundable;
    private String category;
    private String brand;
    private String orderDate;

    public Goods(int id, String name, String weight, int amount, boolean refundable, String category, String brand,
                 String orderDate) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.amount = amount;
        this.refundable = refundable;
        this.category = category;
        this.brand = brand;
        this.orderDate = orderDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", amount=" + amount +
                ", refundable=" + refundable +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
