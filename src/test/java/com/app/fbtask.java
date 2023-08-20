package com.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fbtask extends base1 {
	
	
	@Parameters(("username"))
	@Test
	public void user(String user) {
		System.out.println(user);
	}
		@Parameters(("password"))
		@Test
		public void pass(String pass) {
			System.out.println(pass);
		}
	

}
