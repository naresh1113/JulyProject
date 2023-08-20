package com.app.base;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {

	public static WebDriver driver = null;
	
	public static void browserlaunch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static String excelReadDataReuseable(int a , int b) {
		String value =null;
		try {
			// location
			File f = new File("L:\\maven\\Test_One_Two\\Test_One_Two\\src\\test\\resources\\TestData\\tsk offline.xlsx");	
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
	
	public static void selectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void typedata(WebElement Element,String Data) {
		Element.sendKeys(Data);
	}
public static void clickdata(WebElement Element) {
	Element.click();
}
	}


