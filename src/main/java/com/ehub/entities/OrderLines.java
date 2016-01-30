package com.ehub.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Ismail on 30/01/2016.
 */
public class OrderLines {
    @Id
    private String id;
    /** Logical foreign keys **/
    private String idOrder;
    private String idProduct;
    /** -------------------- **/
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
