package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
       HomePage homepageobj;
	CompaniesPage companiesobj;
	 LoginPageTest loginpageobj= new LoginPageTest();
	
	HomePageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		
			 
		 homepageobj = new HomePage();
		 
		 
		 
	}
	@Test
	public void validateHomePageTitle() {
		 loginpageobj.loginTest();
		String title=homepageobj.verifyHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test
	public void validateCogmentoLogo() {
		boolean logoDisplayed=homepageobj.verifyCogmentoIdIsDisplayed();
		System.out.println(logoDisplayed);
		//Assert.assertEquals(logoDisplayed, "true","please check the code again logo not displayed");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
