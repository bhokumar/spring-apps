package org.webflux.webfluxapp.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.webflux.webfluxapp.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
