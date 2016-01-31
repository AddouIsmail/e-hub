package com.ehub.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by Ismail on 30/01/2016.
 */
public class Product {
    @Id
    private String id;
    /** Logical foreign keys **/
    private List<String> idCategory;
    private String idSupplier;
    /** -------------------- **/
    private String name;
    private String description;
    private double buyPrice;
    private double discount;
    private int quantity;
    private double shippedPrice;
    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(List<String> idCategory) {
        this.idCategory = idCategory;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getShippedPrice() {
        return shippedPrice;
    }

    public void setShippedPrice(double shippedPrice) {
        this.shippedPrice = shippedPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
