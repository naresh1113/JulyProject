package com.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class base1 {
	

	WebDriver driver = new ChromeDriver();
	@Parameters(("url"))
	@BeforeClass
	
	public void beforeclass(String url) {
	driver.manage().window().maximize();
	driver.get(url);
	
	
}
}