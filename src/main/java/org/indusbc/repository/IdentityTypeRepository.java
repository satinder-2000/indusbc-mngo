package org.indusbc.repository;

import org.indusbc.model.IdentityType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdentityTypeRepository extends MongoRepository<IdentityType, Integer> {

}
