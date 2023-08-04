package com.springbootRest.model;

import java.text.DateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Student_Report_Card")
public class StudenReportCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name="First Name" ,length=25)
	private String studentFisrtName;
	
	@Column(name="Last Name" ,length= 25)
	private String studentLastName;
	
	//@Column(name="Date of Birthday", upd)
	
	private String dob;
	
	
	private String section;
	

	private String gender;
	
	private double marks1;
	
	private double marks2;
	
	private double marks3;
	
	private double total;
	
	private double average;
	
	private double Result;

	




	

}
