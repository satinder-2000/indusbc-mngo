package org.indusbc.service;

import java.util.List;
import java.util.logging.Logger;

import org.indusbc.model.RevenueCategory;
import org.indusbc.repository.RevenueCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RevenueCategoryServiceImpl implements RevenueCategoryService {
	
	private static final Logger LOGGER = Logger.getLogger(RevenueCategoryServiceImpl.class.getName());
	
	@Autowired
	private RevenueCategoryRepository revenueCategoryRepository;

	@Override
	public List<RevenueCategory> getAllByYear(int year) {
		List<RevenueCategory> toReturn = revenueCategoryRepository.findByYear(year);
		LOGGER.info(String.format("Count of RevenueCategory(s) for year %d is %d", year, toReturn.size()));
		return toReturn;
	}

}
