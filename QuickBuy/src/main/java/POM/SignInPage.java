package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;
	
	@FindBy (className = "login")
	private WebElement login; 

	@FindBy (id= "email")
	private WebElement email;
	
	@FindBy (id= "passwd")
	private WebElement passwd;
	
	@FindBy (id= "SubmitLogin")
	private WebElement submit;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
