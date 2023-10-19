package org.indusbc.model;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "ExpenseAccount")
public class ExpenseAccount {
	
	@Id
	private ObjectId id;
	@NotBlank
    @Size(max = 90)
	private String name;
	@NotBlank
	private ObjectId expensePartyId;
	@NotBlank
	private String expenseAccountHash;
	@NotBlank
	private ObjectId expenseCategoryId;
	@NotBlank
	private LocalDateTime createdOn;
	//See https://chamindu.dev/posts/localdatetime-spring-mongodb/
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ObjectId getExpensePartyId() {
		return expensePartyId;
	}
	public void setExpensePartyId(ObjectId expensePartyId) {
		this.expensePartyId = expensePartyId;
	}
	public String getExpenseAccountHash() {
		return expenseAccountHash;
	}
	public void setExpenseAccountHash(String expenseAccountHash) {
		this.expenseAccountHash = expenseAccountHash;
	}
	public ObjectId getExpenseCategoryId() {
		return expenseCategoryId;
	}
	public void setExpenseCategoryId(ObjectId expenseCategoryId) {
		this.expenseCategoryId = expenseCategoryId;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	
	

}
