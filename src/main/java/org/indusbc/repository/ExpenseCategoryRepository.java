package org.indusbc.repository;

import java.util.List;

import org.indusbc.model.ExpenseCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseCategoryRepository extends MongoRepository<ExpenseCategory, Integer> {

	List<ExpenseCategory> findByYear(int year);
}
