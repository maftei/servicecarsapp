package com.maftraz.servicecarsapp.model;

public class ClsPerson {

    private String FirtsName;
    private String LastName;

    public void setFirtsName(String firtsName) {
        this.FirtsName = firtsName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public ClsPerson(String firtsName, String lastName) {
        this.FirtsName = firtsName;
        this.LastName = lastName;
    }
}
