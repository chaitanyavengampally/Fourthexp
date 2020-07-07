package TestCases;
/* 
 * author chaitanya
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;
import Pages.LoginPage;

public class CheckValidUser {
	@Test
	public void verifyvaliduser() throws InterruptedException {
		
		//WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.facebook.com/");
		
		
		WebDriver driver=BrowserFactory.startBrowser("firefox","https://www.facebook.com/");
		
		//WebDriver driver=BrowserFactory.startBrowser("ie","https://www.facebook.com/");
		
		
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		
		
		loginpage.Loignvalid("9393607606","Chaitanya.1432001@");
		Thread.sleep(100);
		
		driver.close();
		System.out.println("succesfully logout....");
	}

}
