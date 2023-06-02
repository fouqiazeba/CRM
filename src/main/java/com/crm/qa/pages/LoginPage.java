package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//we have to define page factory or OR object repository  
	//defining page libraries 
	@FindBy(name="username")
	WebElement username;
   
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signUpLink;
	
	@FindBy(xpath="(//img[contains(@class,'img-responsive')])[1]")
	WebElement CrmProLogo;
	
	
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
	
	public boolean validateCrmImg() {
		return CrmProLogo.isDisplayed();	
	}
	
	public void login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		//return new HomePage();
	}
	
	//this method is returning Home page 
	
	
	
	
	
	
}
