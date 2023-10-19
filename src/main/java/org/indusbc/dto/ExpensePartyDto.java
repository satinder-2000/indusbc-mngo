package org.indusbc.dto;

import java.time.LocalDate;

public class ExpensePartyDto {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	public LocalDate getMemorableDate() {
		return memorableDate;
	}
	public void setMemorableDate(LocalDate memorableDate) {
		this.memorableDate = memorableDate;
	}
	public String[] getExpenseAccounts() {
		return expenseAccounts;
	}
	public void setExpenseAccounts(String[] expenseAccounts) {
		this.expenseAccounts = expenseAccounts;
	}
	private String email;
	private String organisation;
	private String identityType;
	private String identityId;
	private LocalDate memorableDate;
	private String[] expenseAccounts;
	
	

}
