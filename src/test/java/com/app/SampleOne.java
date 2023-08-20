package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleOne {
	
	public static void excelRead() {
	try {
		// location
		File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_One_Two\\src\\test\\resources"
				+ "\\TestData\\July_Offline.xlsx");	
		// read -> FileInput
		FileInputStream fis = new FileInputStream(f);
		// work book 
		Workbook wb = new XSSFWorkbook(fis);
		// sheet
		Sheet sheet = wb.getSheet("Sheet1");
		//row
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(2);
		System.out.println(cell);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	// excel entire print
	public static void excelAllDataRead() {
		try {
			// location
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_One_Two\\src\\test\\resources"
					+ "\\TestData\\July_Offline.xlsx");	
			// read -> FileInput
			FileInputStream fis = new FileInputStream(f);
			// work book 
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			//	System.out.println(physicalNumberOfCells);
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	// change the Date and number format
	public static void excelReadData() {
		try {
			// location
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_One_Two\\src\\test\\resources"
					+ "\\TestData\\July_Offline.xlsx");	
			// read -> FileInput
			FileInputStream fis = new FileInputStream(f);
			// work book 
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			//row
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(2);
			System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				String value = cell.getStringCellValue();
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("DD-MM-YYYY");
			String format = s.format(dateCellValue);
				}else {
					double number = cell.getNumericCellValue();
					long l = (long)number;
					String num = String.valueOf(l);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	// change the Date and number format
		public static String excelReadDataReuseable(int a , int b) {
			String value =null;
			try {
				// location
				File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_One_Two\\src\\test\\resources"
						+ "\\TestData\\July_Offline.xlsx");	
				// read -> FileInput
				FileInputStream fis = new FileInputStream(f);
				// work book 
				Workbook wb = new XSSFWorkbook(fis);
				// sheet
				Sheet sheet = wb.getSheet("Sheet1");
				//row
				Row row = sheet.getRow(a);
				Cell cell = row.getCell(b);
				//System.out.println(cell);
				int cellType = cell.getCellType();
				if(cellType==1) {
					value = cell.getStringCellValue();
					System.out.println(value);
				}else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
				value = s.format(dateCellValue);
				System.out.println(value);
				
					}else {
						double number = cell.getNumericCellValue();
						long l = (long)number;
						value = String.valueOf(l);
						System.out.println(value);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return value;
			}
	public static void main(String[] args) {
		excelReadDataReuseable(2,1); 
	}

}
