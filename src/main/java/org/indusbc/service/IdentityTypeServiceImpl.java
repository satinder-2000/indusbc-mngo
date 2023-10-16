package org.indusbc.service;

import java.util.List;
import java.util.logging.Logger;

import org.indusbc.model.IdentityType;
import org.indusbc.repository.IdentityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IdentityTypeServiceImpl implements IdentityTypeService {
	
	private static final Logger LOGGER = Logger.getLogger(IdentityTypeServiceImpl.class.getName());
	
	@Autowired
	private IdentityTypeRepository identityTypeRepository;

	@Override
	public List<IdentityType> getAllIdentityTypes() {
		List<IdentityType> toReturn = identityTypeRepository.findAll();
		LOGGER.info(String.format("Count of IdentityType(s) is %d", toReturn.size()));
		return toReturn;
	}

}
