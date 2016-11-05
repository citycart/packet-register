package com.citycart.packetregister.model.builder;

import com.citycart.packetregister.model.Address;

/**
 * Created by otm on 29/10/16.
 */
public class AddressBuilder {
    private Address address;

    public AddressBuilder() {
        this.address = new Address();
    }

    public AddressBuilder withAddressLine1(final String addressLine1){
        address.setAddressLine1(addressLine1);
        return this;
    }

    public AddressBuilder withAddressLine2(final String addressLine2){
        address.setAddressLine2(addressLine2);
        return this;
    }

    public AddressBuilder withZipCode(final String zipCode){
        address.setZipCode(zipCode);
        return this;
    }

    public AddressBuilder withCity(final String City){
        address.setCity(City);
        return this;
    }

    public AddressBuilder withCountry(final String country){
        address.setCountry(country);
        return this;
    }

    public AddressBuilder withFloor(final String floor){
        address.setFloor(floor);
        return this;
    }

    public AddressBuilder withIntercom(final String intercom){
        address.setIntercom(intercom);
        return this;
    }

    public AddressBuilder withDigicode(final String digicode){
        address.setDigicode(digicode);
        return this;
    }

    public AddressBuilder withNotes(final String notes){
        address.setNotes(notes);
        return this;
    }

    public Address build(){
        return address;
    }
}
