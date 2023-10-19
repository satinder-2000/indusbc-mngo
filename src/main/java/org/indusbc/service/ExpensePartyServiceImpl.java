package org.indusbc.service;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.bson.types.ObjectId;
import org.indusbc.dto.ExpensePartyDto;
import org.indusbc.dto.ResultDto;
import org.indusbc.dto.ResultType;
import org.indusbc.model.ExpenseAccount;
import org.indusbc.model.ExpenseParty;
import org.indusbc.repository.ExpensePartyRepository;
import org.indusbc.util.HashGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExpensePartyServiceImpl implements ExpensePartyService {
	
	private static final Logger LOGGER = Logger.getLogger(ExpensePartyServiceImpl.class.getName());
	
	@Autowired
	private ExpensePartyRepository expensePartyRepository;
	@Autowired
	private ExpenseAccountService expenseAccountService;
	
	@Override
	public ResultDto createExpenseParty(ExpensePartyDto expensePartyDto) {
		ExpenseParty expenseParty =new ExpenseParty();
		expenseParty.setName(expensePartyDto.getName());
		expenseParty.setEmail(expensePartyDto.getEmail());
		expenseParty.setOrganisation(expensePartyDto.getOrganisation());
		expenseParty.setIdentityType(expensePartyDto.getIdentityType());
		expenseParty.setIdentityId(expensePartyDto.getIdentityId());
		expenseParty.setMemorableDate(expensePartyDto.getMemorableDate());
		//Party Hash
        String partyHash=HashGenerator.generateHash(expenseParty.getName().concat(expenseParty.getEmail().concat(expenseParty.getIdentityId())));
        expenseParty.setPartyHash(partyHash);
        expenseParty=expensePartyRepository.save(expenseParty);
		LOGGER.info(String.format("ExpenseParty created with ID : ", expenseParty.getId()));
		for (String expAcct : expensePartyDto.getExpenseAccounts()) {
			ExpenseAccount expenseAccount = new ExpenseAccount();
			expenseAccount.setName(expAcct);
			expenseAccount.setExpensePartyId(expenseParty.getId());
			expenseAccount.setCreatedOn(LocalDateTime.now());
			expenseAccount.setExpenseAccountHash(HashGenerator.generateHash(expAcct));
			expenseAccount = expenseAccountService.createExpenseAccount(expenseAccount);
			LOGGER.info(String.format("ExpenseAccount created with ID : ", expenseAccount.getId()));
		}
		ResultDto resultDto= new ResultDto(ResultType.SUCCESS,"ExpenseParty created with ID : "+expenseParty.getId());
		return resultDto;
	}

}
