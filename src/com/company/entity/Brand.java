package com.company.entity;

public class Brand {

    private int id;
    private String brand;
    private String madeInCountry;

    public Brand(int id, String brand, String madeInCountry) {
        this.id = id;
        this.brand = brand;
        this.madeInCountry = madeInCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.madeInCountry = madeInCountry;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                "brand='" + brand + '\'' +
                ", madeInCountry='" + madeInCountry + '\'' +
                '}';
    }
}