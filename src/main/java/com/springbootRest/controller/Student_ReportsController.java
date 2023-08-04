package com.springbootRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootRest.Exception.StudentMarksLessThanPassMarks;
import com.springbootRest.model.StudenReportCard;
import com.springbootRest.services.IStudent_ReportsService;

@RestController
@RequestMapping("/student")
public class Student_ReportsController {
	
	
	@Autowired
	private IStudent_ReportsService service;
	
	@PostMapping("/home")
	public ResponseEntity<String> saveAllRecords(@RequestBody StudenReportCard cards){
		
				Integer id=	service.saveStudenReportsmodel(cards);
		
		return ResponseEntity.ok("Student Records Id '"+id+"' is Saved Successfully.");
	}

	
	
	@PutMapping("update/{id}")
	public ResponseEntity<String> updateProdModel
	(@PathVariable Integer id, @RequestBody StudenReportCard ids) {

		
		  
		
		  if(service.isStudenReportsmodelExist(id)) {
			  ids.setStudentId(id);
		  service.updateStudenReportsmodel(ids);
		  
		  return ResponseEntity.ok("Studnt Id '"+id+"'is Updated.");
		  
		
		  }else {
			  throw new StudentMarksLessThanPassMarks("Studnt Id '"+id+"'is not availale."); 
			  }
			  
	}
}