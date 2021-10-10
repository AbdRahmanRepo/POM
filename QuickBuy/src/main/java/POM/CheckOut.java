package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedChkOut1;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedChkOut2;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement textarea;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement address;
	
	@FindBy(id = "cgv")
	private WebElement cvg;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement process;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bnkwire;
	
	public CheckOut (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	public WebElement getProceedChkOut1() {
		return proceedChkOut1;
	}

	public WebElement getProceedChkOut2() {
		return proceedChkOut2;
	}

	public WebElement getTextarea() {
		return textarea;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCvg() {
		return cvg;
	}

	public WebElement getProcess() {
		return process;
	}

	public WebElement getBnkwire() {
		return bnkwire;
	}
	
	
	

}
