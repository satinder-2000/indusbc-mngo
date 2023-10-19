package org.indusbc.dto;

public class ResultDto {
	
	private ResultType resultType;
	private String message;
	
	
	
	public ResultDto(ResultType resultType, String message) {
		super();
		this.resultType = resultType;
		this.message = message;
	}
	
	public ResultType getResultType() {
		return resultType;
	}
	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	 

}
