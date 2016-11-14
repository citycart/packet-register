package com.citycart.packetregister.repository;

import com.citycart.model.Retailer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by otm on 30/10/16.
 */
public interface RetailerRepository extends MongoRepository<Retailer, String> {
    Retailer findByName(final String name);
}
