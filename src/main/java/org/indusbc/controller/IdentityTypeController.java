package org.indusbc.controller;

import java.util.List;
import org.indusbc.model.IdentityType;
import org.indusbc.service.IdentityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityTypeController {
	
	@Autowired
	private IdentityTypeService identityTypeService;
	
	@GetMapping("/IdentityType")
	public ResponseEntity<List<IdentityType>> getIdentityTypes(){
		return ResponseEntity.ok().body(identityTypeService.getAllIdentityTypes());
	}
	

}
