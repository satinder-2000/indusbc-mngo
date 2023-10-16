package org.indusbc.service;

import java.util.List;

import org.indusbc.model.RevenueCategory;

public interface RevenueCategoryService {
	
	public List<RevenueCategory> getAllByYear(int year);

}
