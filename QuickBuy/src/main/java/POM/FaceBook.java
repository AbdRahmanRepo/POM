package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	public static WebDriver driver;
	
	public WebElement email1 = driver.findElement(By.id("quantity_wanted"));
	
	@FindBy (id="email") //driver.findElement.By.id("email");
	private WebElement email;

	@FindBy (name="pass")
	private WebElement password;
	
	@FindBy (name="login")
	private WebElement btn;// int i;
	
	public FaceBook(WebDriver upcoming) {
		this.driver = upcoming;
		PageFactory.initElements(upcoming, this); //FaceBook.class
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getEmail() {
		return email;
	}

//	public void setEmail(WebElement email) {
//		this.email = email;
//	}

	public WebElement getPassword() {
		return password;
	}

//	public void setPassword(WebElement password) {
//		this.password = password;
//	}

	public WebElement getBtn() {
		return btn;
	}

//	public void setBtn(WebElement btn) {
//		this.btn = btn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	}

}
