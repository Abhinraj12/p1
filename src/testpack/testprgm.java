package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepack.pageprgm;

public class testprgm {
	
		
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/");
			
		}
		@Test
		public void test() throws InterruptedException
		{
			pageprgm ob = new pageprgm(driver);
			ob.click();
			Thread.sleep(3000);
			ob.setupvalues("abhinraj","mk","abhinrajmk589@gmail.com","9946544241","abhi1234","abhi1234");
			Thread.sleep(4000);
			ob.click1();
			Thread.sleep(4000);
			ob.login();
			Thread.sleep(4000);
			ob.login1();
			
		}

	}



