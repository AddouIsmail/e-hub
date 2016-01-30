package com.ehub.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Ismail on 30/01/2016.
 */
public class PaymentMode {
    @Id
    private String id;
    private String modality;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}
