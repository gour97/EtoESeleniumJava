package com.nitor.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {
	
	
	@Test
    public void tc_001() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("deepa");
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.quit();
		
	}
	@BeforeMethod
	public void  browser() {
		
	}

}
