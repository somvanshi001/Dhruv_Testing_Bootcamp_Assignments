package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class IDNameXpath {
	WebDriver driver;
	String baseURL = "https://practicetestautomation.com/practice-test-login/";
	

	@Test

	public void IDlocator() {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		String baseURL = driver.getCurrentUrl();
		// Extract "logged-in-successfully"
		String urlText = baseUrl.substring(baseUrl.lastIndexOf("/") + 1,
		                                      baseUrl.length() - 1);

		// Replace '-' with spaces
		urlText = urlText.replace("-", " ");

		// IF name and XPath
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();

		String Text = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
		System.out.println("Actual Heading : "+ Text);
		if(Text.equals("Logged In Successfully")){
			System.out.println("Heading matches");
		}
		else {
			System.out.println("Heading mismatches");
		}

		driver.quit();

	}
}
