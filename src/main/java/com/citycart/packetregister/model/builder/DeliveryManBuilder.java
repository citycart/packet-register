package com.citycart.packetregister.model.builder;

import com.citycart.packetregister.model.Address;
import com.citycart.packetregister.model.DeliveryMan;
import com.citycart.packetregister.model.DeliveryManStatus;

import java.time.LocalDate;

/**
 * Created by otm on 30/10/16.
 */
public class DeliveryManBuilder {

    private DeliveryMan deliveryMan;

    public DeliveryManBuilder() {
        deliveryMan = new DeliveryMan();
    }

    public DeliveryManBuilder withFirstName(final String firstName){
        deliveryMan.setFirstName(firstName);
        return this;
    }

    public DeliveryManBuilder withLastName(final String lastName){
        deliveryMan.setLastName(lastName);
        return this;
    }

    public DeliveryManBuilder withBirthDate(final LocalDate birthDate){
        deliveryMan.setBirthDate(birthDate);
        return this;
    }

    public DeliveryManBuilder withPhoneNumber(final String phoneNumber){
        deliveryMan.setPhoneNumber(phoneNumber);
        return this;
    }

    public DeliveryManBuilder withEmail(final String email){
        deliveryMan.setEmail(email);
        return this;
    }

    public DeliveryManBuilder withAddress(final Address address){
        deliveryMan.setAddress(address);
        return this;
    }

    public DeliveryManBuilder withCurrentStatus(final DeliveryManStatus currentStatus){
        deliveryMan.setCurrentStatus(currentStatus);
        return this;
    }

    public DeliveryMan build(){
        return deliveryMan;
    }
}
