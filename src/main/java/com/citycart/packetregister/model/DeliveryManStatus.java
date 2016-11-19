package com.citycart.packetregister.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by otm on 29/10/16.
 */
public class DeliveryManStatus  implements Serializable {
    private Status statusValue;
    private LocalDateTime statusTime;

    public DeliveryManStatus() {
    }

    public DeliveryManStatus(Status statusValue, LocalDateTime statusTime) {
        this.statusValue = statusValue;
        this.statusTime = statusTime;
    }

    public Status getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(Status statusValue) {
        this.statusValue = statusValue;
    }

    public LocalDateTime getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(LocalDateTime statusTime) {
        this.statusTime = statusTime;
    }

    @Override
    public String toString() {
        return "DeliveryManStatus{" +
                ", statusValue=" + statusValue +
                ", statusTime=" + statusTime +
                '}';
    }

    public enum Status{
        CREATED, ACTIVE,INACTIVE, SUSPENDED, DELETED;
    }
}
