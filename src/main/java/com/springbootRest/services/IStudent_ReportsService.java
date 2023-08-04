package com.springbootRest.services;

import com.springbootRest.model.StudenReportCard;

public interface IStudent_ReportsService {
	
	Integer saveStudenReportsmodel(StudenReportCard std);
	
	void updateStudenReportsmodel(StudenReportCard ids);
	
	boolean isStudenReportsmodelExist(Integer id);

}
