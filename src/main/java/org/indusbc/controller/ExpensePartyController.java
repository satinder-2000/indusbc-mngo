package org.indusbc.controller;

import java.util.logging.Logger;

import org.indusbc.dto.ExpensePartyDto;
import org.indusbc.model.ExpenseParty;
import org.indusbc.service.ExpensePartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensePartyController {
	
	@Autowired
	private ExpensePartyService expensePartyService;
	
	private static final Logger LOGGER=Logger.getLogger(ExpensePartyController.class.getName());
	
	@PostMapping("/ExpensePartyRegister")
	public ResponseEntity<ExpenseParty> createParty(@RequestBody ExpensePartyDto expensePartyDto) {
		ExpenseParty expensePartyDb=expensePartyService.createExpenseParty(expensePartyDto);
		LOGGER.info(String.format("ExpenseParty created with ID : ", expensePartyDb.getId()));
		return ResponseEntity.ok().body(expensePartyDb);
		
	}

}
