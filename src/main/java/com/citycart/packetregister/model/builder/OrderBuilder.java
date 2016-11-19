package com.citycart.packetregister.model.builder;


import com.citycart.packetregister.model.*;

import java.time.LocalDateTime;

/**
 * Created by otm on 22/10/16.
 */
public class  OrderBuilder {
    private Order order;

    public OrderBuilder(){
        order = new Order();
    }

    public OrderBuilder withOrderNumber(String orderNumber){
        order.setOrderNumber(orderNumber);
        return this;
    }

    public OrderBuilder withCtreationDate(final LocalDateTime creationDate){
        order.setCreationDate(creationDate);
        return this;
    }

    public OrderBuilder withWithdrawAddress(final Address withdrawAddress){
     order.setWithdrawAddress(withdrawAddress);
        return this;
    }

    public OrderBuilder withDeliveryAddress(final Address deliveryAddress){
        order.setDeliveryAddress(deliveryAddress);
        return this;
    }

    public OrderBuilder withPacksCount(final Integer packsCount){
        order.setPacksCount(packsCount);
        return this;
    }

    public OrderBuilder withCurrentStatus(final OrderStatus currentStatus){
        order.setCurrentStatus(currentStatus);
        return this;
    }

    public OrderBuilder withRetailer(final Retailer retailer){
        order.setRetailer(retailer);
        return this;
    }

    public OrderBuilder withDeliveryMan(final DeliveryMan deliveryMan){
        order.setDeliveryMan(deliveryMan);
        return this;
    }

    public Order build(){
        return order;
    }
}
