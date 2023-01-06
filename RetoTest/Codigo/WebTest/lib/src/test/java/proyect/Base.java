package proyect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Managed;

public class Base {
	
	@Managed
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnect(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public WebElement findElement(By var) {
		return driver.findElement(var);
	}
	
	public void typeWrite(String text,By var) {
		driver.findElement(var).sendKeys(text);
	}
	
	public void click(By var) {
		driver.findElement(var).click();
	}
	
	public void tearDown() {
		driver.quit();;
	}
	
	 
	

}
