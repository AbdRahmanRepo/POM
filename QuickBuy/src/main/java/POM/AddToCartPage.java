package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public WebDriver driver;
	
	@FindBy (xpath="(//a[@title='T-shirts'])[2]") //driver.findElement.By.id("email");
	private WebElement Tshirt_Btn; // WebElement Tshire_btn = driver.findElement(by.xpath="(//a[@title='T-shirts'])[2]")
	
	@FindBy (xpath="//a[@title='View']")
	private WebElement More_btn;
	
	@FindBy (id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy (id="group_1")
	private WebElement sizeselect;  
	
	@FindBy (id="color_14")
	private WebElement colour;
	
	@FindBy (xpath="//button[@name='Submit']")
	private WebElement AddTocart_btn;
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	public WebElement getTshirt_Btn() {
		return Tshirt_Btn;
	}

	public WebElement getMore_btn() {
		return More_btn;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSizeselect() {
		return sizeselect;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAddTocart_btn() {
		return AddTocart_btn;
	}

}
