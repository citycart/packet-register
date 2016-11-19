package com.citycart.packetregister.repository;

import com.citycart.packetregister.model.Order;
import com.citycart.packetregister.model.OrderStatus.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * Created by otm on 23/10/16.
 */
@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository extends MongoRepository<Order, String> { //, QueryDslPredicateExecutor<Order>

//    Optional<Order> findById(@Param("orderId") final String orderId);
    Optional<Order> findByOrderNumber(@Param("orderNumber") final String orderNumber);
    List<Order> findByRetailerId(@Param("retailerId") final String retailerId);
    List<Order> findByDeliveryManId(@Param("deliveryManId") final String deliveryManId);
    List<Order> findByCurrentStatusStatusValue(@Param("orderStatus") final Status currentStatus);
}
