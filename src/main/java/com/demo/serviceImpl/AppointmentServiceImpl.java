package com.demo.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.model.Appointment;
import com.demo.service.AppointmentService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class AppointmentServiceImpl implements AppointmentService{
	
	
    public String generateReport() {
    	
    	List<Appointment> alist=new ArrayList<>();
    	alist.add(new Appointment(1,"amit panchal", 42,75,169, "o +ve","+917325556654", "amravati", "dr abhijeet mane",null,"17:30:55","dengue","no"));
    	alist.add(new Appointment(3,"karan joshi", 39,86,173, "AB +ve","+919325556654", "nagpur", "dr nikhil balankhe",null,"18:55:25","fever","no"));
    	alist.add(new Appointment(2,"khushboo rathi", 28,71,155, "o +ve","+916325556654", "pune", "dr swapnil koli",null,"13:30:35","fever","corona"));
		
    	Map<String,Object> parameter=new HashMap<>();
    	parameter.put("hospitalName","Viveka Hospital");
    	
    JRBeanCollectionDataSource datasource=new JRBeanCollectionDataSource(alist);
    
    String filePath="F:\\Users\\SR Kale\\eclipse-workspace2 Shivaji Sir\\RecallJasperReport\\src\\main\\resources\\hms.jrxml";
    
    try {
		JasperReport report=JasperCompileManager.compileReport(filePath);
		JasperPrint print=JasperFillManager.fillReport(report, parameter, datasource);
		
		String pdfReportPath="E:\\Document\\RecallJasperReport.pdf";
		
		JasperExportManager.exportReportToPdfFile(print, pdfReportPath);
		    
	} 
    
    catch (JRException e) {
		e.printStackTrace();
	}
  		
      //   return null;
		return "report generated successfully";
	}
	
	

}
