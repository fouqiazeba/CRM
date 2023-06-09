package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//we have to define page factory or OR object repository  
	//defining page libraries 
	@FindBy(name="email")
	WebElement email;
   
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signUpLink;
	
//	@FindBy(xpath="(//img[contains(@class,'img-responsive')])[1]")
//	WebElement CrmProLogo;
	
	
	//initialization of page objects or OR
	public LoginPage() {
		//in this way we initialize our page factory using page factory method initElements()..
		//this refers to all above login page variables(current class objects).
		PageFactory.initElements(driver,this);
	}
	
	
	//Actions or features available on login page.
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
//	public boolean validateCrmImg() {
//		return CrmProLogo.isDisplayed();	
//	}
	public boolean validateEmailBnIsDisplayed() {
		boolean isDispalyedbtn=email.isDisplayed();
		return isDispalyedbtn;
		
	}
	
	public HomePage login(String em,String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	//this method is returning Home page 
	
	
	
	
	
	
}
