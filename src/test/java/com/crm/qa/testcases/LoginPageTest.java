package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpageobj;
	HomePage homepageobj;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginpageobj = new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title= loginpageobj.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	//@Test(priority=2)
//	public void crmLogoImageTest() {
//		boolean flag=loginpageobj.validateCrmImg();
//		Assert.assertTrue(flag);
//	}
	@Test(priority=3)
	public void emailIsDisplayed() {
		boolean emailISDisplay=loginpageobj.validateEmailBnIsDisplayed();
		//return emailISDisplay;
		System.out.println(emailISDisplay);
		
	}
	@Test(priority=2)
	public void loginTest() {
	homepageobj  =	loginpageobj.login(prop.getProperty("emailid"), prop.getProperty("password"));
	//loginpageobj.login(prop.getProperty("emailid"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	
	
	}
	
	
	
	

}
