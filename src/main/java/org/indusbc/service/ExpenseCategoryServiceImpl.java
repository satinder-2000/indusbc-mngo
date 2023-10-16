package org.indusbc.service;

import java.util.List;
import java.util.logging.Logger;

import org.indusbc.model.ExpenseCategory;
import org.indusbc.repository.ExpenseCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {
	
	private static final Logger LOGGER = Logger.getLogger(ExpenseCategoryServiceImpl.class.getName());
	
	@Autowired
	private ExpenseCategoryRepository expenseCategoryRepository;

	@Override
	public List<ExpenseCategory> getAllByYear(int year) {
		List<ExpenseCategory> toReturn=expenseCategoryRepository.findByYear(year);
		LOGGER.info(String.format("Count of ExpenseCategory(s) for year %d is %d",year, toReturn.size()));
		return toReturn;
	}

}
