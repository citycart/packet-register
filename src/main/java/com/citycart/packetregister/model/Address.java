package com.citycart.packetregister.model;

/**
 * Created by otm on 22/10/16.
 */
public class Address {

    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String zipCode;
    private String city;
    private String country;
    private String floor;
    private String intercom;
    private String digicode;
    private String notes;

    public Address() {
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getIntercom() {
        return intercom;
    }

    public void setIntercom(String intercom) {
        this.intercom = intercom;
    }

    public String getDigicode() {
        return digicode;
    }

    public void setDigicode(String digicode) {
        this.digicode = digicode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", floor='" + floor + '\'' +
                ", intercom='" + intercom + '\'' +
                ", digicode='" + digicode + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
