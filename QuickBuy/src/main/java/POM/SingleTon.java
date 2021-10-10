package POM;

import org.openqa.selenium.WebDriver;

public class SingleTon {
	public WebDriver driver;
	
	private SignInPage sip = null;
	private AddToCartPage actp= null;
	private FaceBook fb = null;
	
	public SingleTon(WebDriver driver) {
		this.driver = driver;
	}
	public FaceBook getInstancesfb() {
		if(fb == null)
			fb = new FaceBook(driver);
		return fb;
	}
	
	public SignInPage getInstancesip() {
		if(sip == null)
			sip = new SignInPage(driver);
		return sip;
	}
	public AddToCartPage getInstanceactp() {
		if(actp == null)
		actp = new AddToCartPage(driver);
		return actp;
	}
	

}
