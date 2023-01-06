package proyect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	By userbox = By.id("LoginPanel0_Username");
	By passbox = By.id("LoginPanel0_Password");
	By buttonAcept = By.id("LoginPanel0_LoginButton");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String user, String pass) {
			
			typeWrite(user, userbox);
			typeWrite(pass, passbox);
			click(buttonAcept);	
	}

}
