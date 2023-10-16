package org.indusbc.controller;

import java.util.List;
import org.indusbc.model.ExpenseCategory;
import org.indusbc.service.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseCategoryController {
	
	@Autowired
	private ExpenseCategoryService expenseCategoryService;
	
	@GetMapping("/ExpenseCategory")
	public ResponseEntity<List<ExpenseCategory>> getExpenseCategories(){
		return ResponseEntity.ok().body(expenseCategoryService.getAllByYear(2023));
	}

}
