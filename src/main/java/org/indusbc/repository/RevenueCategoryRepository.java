package org.indusbc.repository;

import java.util.List;
import org.indusbc.model.RevenueCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RevenueCategoryRepository extends MongoRepository<RevenueCategory, Integer> {

	List<RevenueCategory> findByYear(int year);
}
