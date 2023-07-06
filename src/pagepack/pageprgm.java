package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageprgm {


		WebDriver driver;
		By myaccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
		By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
		By nvfirstname = By.xpath("//*[@id=\"input-firstname\"]");
		By nvlastname = By.xpath("//*[@id=\"input-lastname\"]");
		By nvemail = By.xpath("//*[@id=\"input-email\"]");
		By nvtelephone = By.xpath("//*[@id=\"input-telephone\"]");
		By nvpassword = By.xpath("//*[@id=\"input-password\"]");
		By nvconfirmpassword = By.xpath("//*[@id=\"input-confirm\"]");
		By nvcheckbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By nvcontinue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By continue2 = By.xpath("//*[@id=\"content\"]/div/div/a");
		
		public pageprgm(WebDriver driver)
		{
			this.driver=driver;
		}
		public void click()
		{
			driver.findElement(myaccount).click();
			driver.findElement(register).click();
		}
		public void setupvalues(String firstname,String lastname,String email,String telephone,String password,String confirmpassword)
		{
			driver.findElement(nvfirstname).sendKeys(firstname);
			driver.findElement(nvlastname).sendKeys(lastname);
			driver.findElement(nvemail).sendKeys(email);
			driver.findElement(nvtelephone).sendKeys(telephone);
			driver.findElement(nvpassword).sendKeys(password);
			driver.findElement(nvconfirmpassword).sendKeys(confirmpassword);
		}
		
		public void click1()
		{
			driver.findElement(nvcheckbox).click();
			
		}
		public void login()
		{
			driver.findElement(nvcontinue).click();
		}
		public void login1()
		{
			driver.findElement(continue2).click();
			
		}

	}


