package com.example.reactiverepositoriesexample;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMongoRepository extends ReactiveMongoRepository<Account, String> {
}
