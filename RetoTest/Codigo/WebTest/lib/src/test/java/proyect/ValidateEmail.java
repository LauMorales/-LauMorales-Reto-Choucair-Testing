package proyect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateEmail extends Base{
	
	By option = By.xpath("/html/body/div[1]/div[1]/div[1]/form/div[2]/a");
	By emailbox = By.xpath("/html/body/div[1]/div/div/form/div/div/div/div/input");

	public ValidateEmail(WebDriver driver) {
		super(driver);
	}
	
	public void enterEmail(String email) {
		click(option);
		typeWrite(email,emailbox);
	}

}
