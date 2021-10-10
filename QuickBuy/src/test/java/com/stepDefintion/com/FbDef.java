package com.stepDefintion.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.helpReader.com.FileReaderManager;

import BaseDemo.BaseClass;
import POM.FaceBook;
import POM.SingleTon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.asserts.SoftAssert;

public class FbDef extends BaseClass {
	public static WebDriver driver;
	SingleTon st = new SingleTon(driver);
	SoftAssert soft = new SoftAssert(); 
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		driver.get("https://google.com");
		driver.navigate().to("https://en-gb.facebook.com/login/");
		Thread.sleep(2000);
	    
	}

	@When("^user enters the valid username and password$")
	public void user_enters_the_valid_username_and_password() throws Throwable {
		input(st.getInstancesfb().getEmail(), FileReaderManager.getInstancefr().getInstancecr().getUserName());
		input(st.getInstancesfb().getPassword(),FileReaderManager.getInstancefr().getInstancecr().getPassword());
	}

	@When("^clicks the Login button$")
	public void clicks_the_Login_button() throws Throwable {
		press(st.getInstancesfb().getBtn());
	    
	}

	@Then("^user should be navigated to home page$")
	public void user_should_be_navigated_to_home_page() throws Throwable {
		String Act = title().trim();
	    String Exp = "Log in to Facebook";
	    soft.assertEquals(Exp, Act);
	  
	}
	


}
