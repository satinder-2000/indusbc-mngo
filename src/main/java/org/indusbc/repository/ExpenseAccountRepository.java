package org.indusbc.repository;

import org.bson.types.ObjectId;
import org.indusbc.model.ExpenseAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseAccountRepository extends MongoRepository<ExpenseAccount, ObjectId> {

}
