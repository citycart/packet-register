package com.citycart.packetregister.repository;

import com.citycart.packetregister.model.DeliveryMan;
import com.citycart.packetregister.model.DeliveryManStatus;
import com.citycart.packetregister.model.DeliveryManStatus.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by otm on 31/10/16.
 */
@RepositoryRestResource(collectionResourceRel = "deliverymen", path = "deliverymen")
public interface DeliveryManRepository extends MongoRepository<DeliveryMan, String> {
    DeliveryMan findByLastName(@Param("lastName") final String lastName);
    DeliveryMan findByPhoneNumber(@Param("phoneNumber") final String phoneNumber);
    DeliveryMan findByEmail(@Param("email") final String email);
    List<DeliveryMan> findByCurrentStatusStatusValue(@Param("currentStatus") final Status currentStatus);
}
