package com.springbootRest.ExceptionHanddler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springbootRest.Exception.StudentMarksLessThanPassMarks;

@RestControllerAdvice
public class StudentMarksLessThanPassMarksHanddler {
	
	@ExceptionHandler(StudentMarksLessThanPassMarks.class)
	public ResponseEntity<String> handdlerStudentMarksLessThanPassMarks(StudentMarksLessThanPassMarks stdEx){
	
		
		return new ResponseEntity<String>(stdEx.getMessage(),HttpStatus.NOT_FOUND);
	}	
	
	

}
