package org.webflux.webfluxapp.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.webflux.webfluxapp.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
