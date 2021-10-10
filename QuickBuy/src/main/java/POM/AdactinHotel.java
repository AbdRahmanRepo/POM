package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel {
	
	public static WebDriver driver;
	
	//Username
	@FindBy (id="username")  
	private WebElement username;
	//Password
	@FindBy (id="password")  
	private WebElement password;
	//Login
	@FindBy (id="login")  
	private WebElement loginBtn;
	
	public AdactinHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	//Getters
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	

}
