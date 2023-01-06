package WebTest;
import proyect.LoginPage;
import proyect.Page;
import proyect.ValidateEmail;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Managed;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SerenityRunner.class)
class WebTestPage {
	@Managed
	private WebDriver driver;
	private Page start;
	private String url;
	private LoginPage person;
	private String user;
	private String pass;
	private ValidateEmail validate;
	private String email;

	@Before
    public void setUp() {
			url = "https://serenity.is/demo/";
    		start = new Page(driver); 
    		start.navigate(url);
    }
	
	@Test
	public void registerPerson() {
		user = "Administrador";
		pass = "serenity";
		person = new LoginPage(driver);
		person.login(user,pass);
	}
	
	@After
	public void valiteEmailUser() {
		email = "lau.morales.ajc@gmail.com";
		validate = new ValidateEmail(driver);
		validate.enterEmail(email);
	}
	
    
}

