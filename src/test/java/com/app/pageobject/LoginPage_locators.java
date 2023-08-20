package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.baseclass;

public class LoginPage_locators extends baseclass{
	public static WebElement username_locators() {
      return driver.findElement(By.xpath("//input[@id='username']")); 
	}
	public static WebElement password_locators() {
	      return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement loginbutton_locators() {
	      return driver.findElement(By.xpath("//input[@id='login']"));  
	
	}
	
	
	
	
	
	
	
	
	
	
	}
