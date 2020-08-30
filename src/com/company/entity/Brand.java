package com.company.entity;

public class Brand {

    private String brand;
    private String madeInCountry;

    public Brand(String brand, String madeInCountry) {
        this.brand = brand;
        this.madeInCountry = madeInCountry;
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
                "brand='" + brand + '\'' +
                ", madeInCountry='" + madeInCountry + '\'' +
                '}';
    }
}
