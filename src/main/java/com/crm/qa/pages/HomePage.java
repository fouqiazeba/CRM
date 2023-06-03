package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	

@FindBy(xpath="//span[text()='fouqia zeba']")
WebElement name;

@FindBy(xpath="//div[@class='header item']")
WebElement cogmentoLogo;

@FindBy(xpath="//body//i[@class='home icon']")
WebElement homeIcon;

@FindBy(xpath="//span[text()='Companies']")
WebElement companiesIcon;

public HomePage(){
	PageFactory.initElements(driver,this);	
}

public boolean verifyUserIdIsDisplayed() {
	 boolean flag = name.isDisplayed();
	return flag;
}
public boolean verifyCogmentoIdIsDisplayed() {
	boolean flagi = cogmentoLogo.isDisplayed();
	return flagi;
}

public void clickonHomeIcon() {
	homeIcon.click();	
}
public String verifyHomePageTitle() {
	return driver.getTitle();
}

public CompaniesPage ClickOnCompaniesIcon(){
	companiesIcon.click();
	return new CompaniesPage();
}


	
}




	

