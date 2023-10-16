package org.indusbc.service;

import java.util.List;

import org.indusbc.model.ExpenseCategory;

public interface ExpenseCategoryService {
	
	public List<ExpenseCategory> getAllByYear(int year);

}
