package com.lara.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.lara.beans.Emp;

public class ExcelEmpListReportView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook wb, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		res.setHeader("Content-Disposition", "attachment:filename=\"emp_listxs.xls\"");
		@SuppressWarnings("unchecked")
		List<Emp> emp=(List<Emp>)model.get("list");
		Sheet sheet=wb.createSheet("Emp List");
		Row header=sheet.createRow(0);
		header.createCell(0).setCellValue("id");
		header.createCell(1).setCellValue("name");
		header.createCell(2).setCellValue("salary");
		header.createCell(3).setCellValue("designation");
		int rowNum=1;
		for(Emp user:emp) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(user.getId());
			row.createCell(1).setCellValue(user.getName());
			row.createCell(2).setCellValue(user.getSalary());
			row.createCell(3).setCellValue(user.getDesignation());

		}
	}

	

}
