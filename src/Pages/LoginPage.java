package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterSuite;


public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"u_0_b\"]")
	WebElement submit;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void Loignvalid(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		
	}
	
	
}
