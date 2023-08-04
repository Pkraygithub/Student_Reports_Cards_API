package com.springbootRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootRest.Exception.StudentMarksLessThanPassMarks;
import com.springbootRest.Repositery.StudentReports_Repositery;
import com.springbootRest.model.StudenReportCard;

@Service
public class Student_ReportsServiceImpl implements IStudent_ReportsService {

	@Autowired
	private StudentReports_Repositery repo;
	
@Override
	public Integer saveStudenReportsmodel(StudenReportCard std) {
	
		

	var mark= std.getMarks1();
	
	var mark1= std.getMarks2();
	var mark2=  std.getMarks3();
	

	
	/*if(mark>=35 || mark1>=35 || mark2>=35) {
	  
	  throw new
	  StudentMarksLessThanPassMarks("Less than 35 marks is Constider as Faile Studnet "); 
	  }*/

	
	var avg =(mark+mark1+mark2)/3.0;
	var totalmrk=mark+mark1+mark2;
	
	if(avg>=35 && mark>=35 && mark1>=35 && mark2>=35) {
		System.out.println("Congt you are passesd");
	}else {
		System.out.println("Congt you are not passesd");
	}
	
	std.setTotal(totalmrk);
	
	std.setAverage(avg);
	std.setResult(0);  
	
	
	
	
	std=repo.save(std);
	
	return std.getStudentId();
	
	}

@Override
public boolean isStudenReportsmodelExist(Integer id) {
	
	return repo.existsById(id);
}

@Override
	public void updateStudenReportsmodel(StudenReportCard ids) {

	

	var mark= ids.getMarks1();
	var mark1= ids.getMarks2();
	var mark2=  ids.getMarks3();
	
	  /*if(mark>=35 || mark1>=35 || mark2>=35) {
	  
		 
		 
		
	  throw new
	  StudentMarksLessThanPassMarks("Less than 35 marks is Constider as Faile Studnet "); 
	  }*/
	 
	
	var totalmrk=mark+mark1+mark2;
	var avg =(mark+mark1+mark2)/3.0;
	
	ids.setTotal(totalmrk);
	ids.setAverage(avg);
	  
	
	if(avg>=40 && mark>=35 && mark1>=35 && mark2>=35) {
		System.out.println("Congt you are passesd");
	}else {
		System.out.println("Congt you are not passesd");
	}
	
	
	repo.save(ids);
	}
}
