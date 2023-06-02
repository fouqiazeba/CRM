package com.crm.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	 
	 //inside the constructor i am reading my properties and initializing prop variable
      public TestBase(){
    	  try {
    		  prop= new Properties();
    		  FileInputStream ip = new FileInputStream("C:\\Users\\mdjav\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
    	      prop.load(ip);
    	 
    	  } catch(FileNotFoundException e) {
    		  e.printStackTrace();
    	  } catch (IOException e) {
    		  e.printStackTrace();
    	  } 
}
	
       
	public static void initialization() {
    	   String browsername = prop.getProperty("browser");
    	   
    	   if(browsername.equals("chrome")) {
    		   ChromeOptions options=new ChromeOptions();
    		    driver=new ChromeDriver(options);
    	   }else if(browsername.equals("firefox")) {
    		  FirefoxOptions options = new FirefoxOptions();
    		  driver= new FirefoxDriver (options);
    	   }
    	   
    	   driver.manage().window().maximize();
    	   driver.manage().deleteAllCookies();
    	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMOUT));
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
    	   
    	   driver.get(prop.getProperty("url"));
       }

}
