package com.ehub.entities;

import java.util.List;
import org.springframework.data.annotation.Id;

/**
 * Created by Ismail on 30/01/2016.
 */
public class Product {

    @Id
    private String id;
    /**
     * Logical foreign keys *
     */
    private List<String> idCategory;
    private String idSupplier;
    /**
     * -------------------- *
     */
    private String name;
    private String description;
    private double buyPrice;
    private double discount;
    private int quantity;
    private double shippedPrice;
    private String brand;
    private List<String> images;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

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

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", idCategory=" + idCategory + ", idSupplier=" + idSupplier + ", name=" + name + ", description=" + description + ", buyPrice=" + buyPrice + ", discount=" + discount + ", quantity=" + quantity + ", shippedPrice=" + shippedPrice + ", brand=" + brand + '}';
    }

}
