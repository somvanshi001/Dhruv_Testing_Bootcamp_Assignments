package BrowsersTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	@Test
	public void EdgeTest() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
}
}
