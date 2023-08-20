package com.app;

import org.openqa.selenium.By;

public class Exe extends BaseClass{
	
	public static void main(String[] args) {
		browserlaunch();
		url("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(excelReadDataReuseable(0,0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(excelReadDataReuseable(0,1));
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys(excelReadDataReuseable(3,1));
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys(excelReadDataReuseable(4,1));
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys(excelReadDataReuseable(5,1));
		driver.findElement(By.xpath("//select[@id='room_nos']")).sendKeys(excelReadDataReuseable(7,1));
		driver.findElement(By.id("datepick_in")).sendKeys(excelReadDataReuseable(1,0));
		driver.findElement(By.id("datepick_out")).sendKeys(excelReadDataReuseable(2,0));
		driver.findElement(By.xpath("//select[@id='adult_room']")).sendKeys(excelReadDataReuseable(8,1));
		driver.findElement(By.xpath("//select[@id='child_room']")).sendKeys(excelReadDataReuseable(9,1));
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		selectRadio(driver.findElement(By.xpath("//input[@id='radiobutton_0']")));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(excelReadDataReuseable(9,1));
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(excelReadDataReuseable(10,1));
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(excelReadDataReuseable(11,1));
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(excelReadDataReuseable(12,1));
		driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys(excelReadDataReuseable(13,1));
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys(excelReadDataReuseable(14,1));
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys(excelReadDataReuseable(15,1));
		driver.findElement(By.id("cc_cvv")).sendKeys(excelReadDataReuseable(16,1));
		driver.findElement(By.id("book_now")).click();
	
	}
}	
