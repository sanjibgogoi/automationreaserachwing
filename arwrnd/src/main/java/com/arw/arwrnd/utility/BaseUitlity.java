package com.arw.arwrnd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseUitlity extends CommonUtility{
	public static WebDriver driver;
	@BeforeSuite
	public void startUp(){
		// Initialise the properties file and Load it
		initialiseProperties();
		initiliseDriver();
	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();// Close browser
		driver.quit(); // Quite driver
		
	}
	
	@BeforeClass
	public void initalisedBeforeClass(){
		
	}
	
	@AfterClass
	public void closedAfterClass(){
		
	}
	
	public void initiliseDriver(){
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"/lib/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", projectPath+"/lib/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.navigate().to(prop.getProperty("url"));
	}
	
	

}
