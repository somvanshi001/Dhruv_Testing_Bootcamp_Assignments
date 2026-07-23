package SeleniumWebDriverTask82;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTask {
	WebDriver driver;
	String baseURL = "https://demo.opencart.com/";
	
	@Test
	public void task() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get(baseURL);

		driver.findElement(By.id("Login")).click();
	}

}
