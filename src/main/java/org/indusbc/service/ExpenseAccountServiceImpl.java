package org.indusbc.service;

import java.util.List;
import java.util.logging.Logger;

import org.bson.types.ObjectId;
import org.indusbc.model.ExpenseAccount;
import org.indusbc.repository.ExpenseAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExpenseAccountServiceImpl implements ExpenseAccountService {
	
	private static final Logger LOGGER=Logger.getLogger(ExpenseAccountServiceImpl.class.getName());
	
	@Autowired
	ExpenseAccountRepository expenseAccountRepository;

	@Override
	public ExpenseAccount createExpenseAccount(ExpenseAccount expenseAccount) {
		ExpenseAccount toReturn = expenseAccountRepository.save(expenseAccount);
		LOGGER.info(String.format("ExpenseAccount created with ID : %s", toReturn.getId().toString()));
		return toReturn;
	}

	@Override
	public List<ExpenseAccount> getExpenseAccountsOfParty(ObjectId partyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
