
package WebTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydides.core.annotations.Managed;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SerenityRunner.class)
class LibraryTest {
	@Managed
	WebDriver driver;
	
	
	
	
	
	
	
	//datos ingresar
	By userbox = By.id("LoginPanel0_Username");
	By passbox = By.id("LoginPanel0_Password");
	By buttonAcept = By.id("LoginPanel0_LoginButton");
	By option = By.xpath("/html/body/div[1]/div[1]/div[1]/form/div[2]/a");
	By emailbox = By.xpath("/html/body/div[1]/div/div/form/div/div/div/div/input");
	By accepts = By.xpath("/html/body/div[1]/div/div/form/button");

	@SuppressWarnings("deprecation")
	@Test
    public void setUp() {
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
         	driver.get("https://serenity.is/demo/");
         	
         	if(driver.findElement(buttonAcept).isDisplayed()) {
         		WebElement user = driver.findElement(userbox);
             	user.clear();
             	user.sendKeys("administrador");
             	
             	WebElement password = driver.findElement(passbox);
             	password.clear();
             	password.sendKeys("serenity");
             	
             	driver.findElement(buttonAcept).click();
             	
             	driver.findElement(option).click();
     	
             	WebElement email = driver.findElement(emailbox);
             	email.clear();
             	email.sendKeys("correo@gmail.com");
             	driver.findElement(accepts).click();
             	
             	
             	driver.quit();
             
         	}else {
         		System.out.print("No cargo la pagina");
         	}
         	
         	
    	
    }
    
}