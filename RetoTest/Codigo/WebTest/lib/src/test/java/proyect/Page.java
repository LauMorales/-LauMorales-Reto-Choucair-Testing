package proyect;

import org.openqa.selenium.WebDriver;

public class Page extends Base{
	

	public Page(WebDriver driver) {
		super(driver);
	}
	
	public void navigate(String url) {
		chromeDriverConnect(url);
	}
	
	public void close() {
		tearDown();
	}

}
