package com.ehub.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Ismail on 30/01/2016.
 */
public class Facture {
    @Id
    private String id;
    /** Logical foreign keys **/
    private String idOrder;
    private String idPaymentMode;
    /** -------------------- **/
    private Double totalPrice;

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

    public String getIdPaymentMode() {
        return idPaymentMode;
    }

    public void setIdPaymentMode(String idPaymentMode) {
        this.idPaymentMode = idPaymentMode;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
