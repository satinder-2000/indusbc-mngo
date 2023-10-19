package org.indusbc.model;

import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "ExpenseParty")
public class ExpenseParty {
	
	@Id
	private ObjectId id;
	@NotBlank
    @Size(max = 90)
	private String name;
	@NotBlank
    @Size(max = 50)
    @Indexed(unique = true)
	private String email;
	@NotBlank
    @Size(max = 90)
	private String organisation;
	@NotBlank
    @Size(max = 25)
	private String identityType;
	@NotBlank
    @Size(max = 25)
	private String identityId;
	@NotBlank
	private LocalDate memorableDate;
	@NotBlank
	private String partyHash;
	
	private String password;
	
	
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
	public String getPartyHash() {
		return partyHash;
	}
	public void setPartyHash(String partyHash) {
		this.partyHash = partyHash;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
