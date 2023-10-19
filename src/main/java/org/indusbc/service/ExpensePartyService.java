package org.indusbc.service;

import org.indusbc.dto.ExpensePartyDto;
import org.indusbc.dto.ResultDto;
import org.indusbc.model.ExpenseParty;

public interface ExpensePartyService {
	
	public ResultDto createExpenseParty(ExpensePartyDto expensePartyDto);

}
