package com.gori.bank.model;

import java.io.Serializable;

public class UserEntity implements Serializable {

    private String userId;

    public String getId() {
        return userId;
    }

    public void setIdf(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return this.getId();
    }
}
