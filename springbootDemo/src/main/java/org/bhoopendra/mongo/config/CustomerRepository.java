package org.bhoopendra.mongo.config;

import java.io.Serializable;

import org.bhoopendra.mongo.config.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Serializable>{

}
