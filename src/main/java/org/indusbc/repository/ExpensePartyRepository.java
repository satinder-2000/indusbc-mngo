package org.indusbc.repository;

import org.bson.types.ObjectId;
import org.indusbc.model.ExpenseParty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpensePartyRepository extends MongoRepository<ExpenseParty, ObjectId> {
	
	public ExpenseParty findByEmail(String email);
	

}
