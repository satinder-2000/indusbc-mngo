package org.indusbc.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.indusbc.model.ExpenseAccount;

public interface ExpenseAccountService {
	
	public ExpenseAccount createExpenseAccount(ExpenseAccount expenseAccount);
	public List<ExpenseAccount> getExpenseAccountsOfParty(ObjectId partyId);

}
