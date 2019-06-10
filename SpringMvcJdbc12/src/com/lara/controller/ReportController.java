//package com.lara.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.lara.beans.Emp;
//import com.lara.dao.EmpDAO;
//import com.lara.report.PdfEmpListReportView;
//
//@Controller
//public class ReportController 
//{
//	 @Autowired
//	 public EmpDAO dao;
//	 
//	 @RequestMapping(value="/report", method=RequestMethod.GET)
//	 public ModelAndView userListReport(){
//		  
//		  
//		  List<Emp> list=dao.getEmployees();
//		  
//		  //if(typeReport != null && typeReport.equals("xls")){
////			   return new ModelAndView(new ExcelUserListReportView(), "userList", list);
////			  } else 
//			
//			   return new ModelAndView(new PdfEmpListReportView(), "list", list);
//			
//		  
//		  
//	 }
//
//}
