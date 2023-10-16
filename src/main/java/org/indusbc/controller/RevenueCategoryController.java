package org.indusbc.controller;

import java.util.List;
import org.indusbc.model.RevenueCategory;
import org.indusbc.service.RevenueCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevenueCategoryController {
	
	@Autowired
	private RevenueCategoryService revenueCategoryService;
	
	@GetMapping("/RevenueCategory")
	public ResponseEntity<List<RevenueCategory>> getExpenseCategories(){
		return ResponseEntity.ok().body(revenueCategoryService.getAllByYear(2023));
	}

}
