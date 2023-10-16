package org.indusbc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "ExpenseCategory")
public class ExpenseCategory {
	
	@Id
	private int _id;
	@NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String expenseCategory;
	@NotBlank
	private int year;
	
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getExpenseCategory() {
		return expenseCategory;
	}
	public void setExpenseCategory(String expenseCategory) {
		this.expenseCategory = expenseCategory;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
