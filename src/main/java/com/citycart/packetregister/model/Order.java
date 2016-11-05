package com.citycart.packetregister.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by otm on 22/10/16.
 */
@Document(collection = "ORDERS")
public class Order implements Serializable {
    @Id
    private String id;
    @Indexed(unique = true)
    private String orderNumber;
    @CreatedDate
    private LocalDateTime creationDate;
    private Address withdrawAddress;
    private Address deliveryAddress;
    private Integer packsCount;
    @Indexed
    private OrderStatus currentStatus;
    private Set<OrderStatus> statusHistory;
    @DBRef
    @Indexed
    private Retailer retailer;
    @DBRef
    @Indexed
    private DeliveryMan deliveryMan;
//    private Position actualPosition;
//    private Set<Position> positionHistory;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Address getWithdrawAddress() {
        return withdrawAddress;
    }

    public void setWithdrawAddress(Address withdrawAddress) {
        this.withdrawAddress = withdrawAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Integer getPacksCount() {
        return packsCount;
    }

    public void setPacksCount(Integer packsCount) {
        this.packsCount = packsCount;
    }

    public OrderStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(OrderStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Set<OrderStatus> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(Set<OrderStatus> statusHistory) {
        this.statusHistory = statusHistory;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderNumber=" + orderNumber +
                ", creationDate=" + creationDate +
                ", withdrawAddress=" + withdrawAddress +
                ", deliveryAddress=" + deliveryAddress +
                ", packsCount=" + packsCount +
                ", currentStatus=" + currentStatus +
                ", statusHistory=" + statusHistory +
                ", retailer=" + retailer +
                ", deliveryMan=" + deliveryMan +
                '}';
    }
}
