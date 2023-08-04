package com.springbootRest.Exception;

public class StudentMarksLessThanPassMarks extends RuntimeException {


	private static final long serialVersionUID = 1L;
	public StudentMarksLessThanPassMarks() {
		super();
	}
	public StudentMarksLessThanPassMarks(String message) {
		
		super(message);
	}
	
	

}
