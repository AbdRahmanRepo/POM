package com.main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.helpReader.com.FileReaderManager;

import BaseDemo.BaseClass;
import POM.AdactinHotel;
import POM.AddToCartPage;
import POM.CheckOut;
import POM.FaceBook;
import POM.SignInPage;
import POM.SingleTon;

public class Launcher extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
//		launch("chrome");
//		max();
//		go(FileReaderManager.getInstancefr().getInstancecr().geturl());
//		freeze();
//		
//		//SignIn Page
//		
//		SignInPage sip = new SignInPage(driver);
//		press(sip.getLogin());
//		input(sip.getEmail(),"abransafa@gmail.com");
//		input(sip.getPasswd(),"Abdul1234");
//		press(sip.getSubmit());
//		WebElement s = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		ss("snap-1");
//		
//		//AddToCart Page
//		
//		AddToCartPage atcp = new AddToCartPage(driver);
//		press(atcp.getTshirt_Btn());
//		press(atcp.getMore_btn());
//		input(atcp.getQuantity(),"5");
//		selectByValue(atcp.getSizeselect(),"3");
//		press(atcp.getColour());
//		press(atcp.getAddTocart_btn());
//		
//		CheckOut ck = new CheckOut(driver);
//		press(ck.getProceedChkOut1());
//		press(ck.getProceedChkOut2());
//		input(ck.getTextarea(),"Pack With Extra Protection");
//		press(ck.getProcess());
//		press(ck.getCvg());
//		moveTo(ck.getBnkwire());
		
			
		
		
//		FaceBook fb = new FaceBook(driver); //Actions act = new Actions(driver);
//		Thread.sleep(3000);
//		input(fb.getEmail(),"onnumilla");
//		input(fb.getPassword(),"880713");
//		press(fb.getBtn());
		
//		
//		launch("chrome");
//		max();
//		go("https://adactinhotelapp.com/");
//		freeze();
//		//AdactinLogin Page
//		AdactinHotel ad = new AdactinHotel(driver);
//		input(ad.getUsername(),FileReaderManager.getInstancefr().getInstancecr().getUserName());
//		input(ad.getPassword(),FileReaderManager.getInstancefr().getInstancecr().getPassword());
//		press(ad.getLoginBtn());
		
		FaceBook fb = new FaceBook(driver);
		input(fb.email1, "Adarsh123@gmail.com");
		
		
	}
	

}
