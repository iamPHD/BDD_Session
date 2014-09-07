package com.seleniumcucumber.selicucum.webconnector;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 There are three layers in this framework:
 1) Feature files -- These can be many (e.g. login.feature)
 2) Step files -- These can be many (e.g. LoginTest.java)
 3) WebConnector -- This is just one
 */


//initialize properties file
//logging
//Selenium layers-- selenium commands
//webconnector will have actual selenium code
//all feature files would be calling corresponding step files & all these files in turn would be 
//calling webconnector

//Create singleton class so that only one object is created. This is required to open only one browser


public class WebConnector {
	
	//initialize properties filesss
	Properties OR = null;
	Properties CONFIG = null;
	//initialize webdriver
	WebDriver driver = null;
	//handle same browser sessions/instance 
	WebDriver mozilla = null;
	WebDriver chrome = null;
	WebDriver ie = null;
	//webconnector singleton
	static WebConnector w;
	
	
	//constructor -- initialize properties file inside constructor
	// declare WebConnector as private to make it as singleton
	private WebConnector(){
		if(OR==null){
			try{
				//initialize OR
				OR = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumcucumber\\selicucum\\config\\OR.properties");
				OR.load(fs); //load the property file
				
				//initialize CONFIG to corresponding env
				CONFIG = new Properties();
				fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumcucumber\\selicucum\\config\\"+OR.getProperty("testEnv")+"_config.properties");
				CONFIG.load(fs);
				
				System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("loginURL"));
				
			}catch(Exception e){
				System.out.println("Error in initializing properties file");
			}
		}
	}
	
	//***************************APPLICATION IN-DEPENDENT FUNCTIONS****************************
	//Opening the browser
	public void openBrowser(String browserType){		
		if(browserType.equals("Mozilla") && mozilla == null){
			driver = new FirefoxDriver();
			mozilla=driver;
		}else if(browserType.equals("Mozilla") && mozilla != null){
			driver = mozilla;
		}else if(browserType.equals("ie") && ie == null){
			System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			ie=driver;
		}else if(browserType.equals("ie") && ie != null){
			driver=ie;
		}else if(browserType.equals("chrome") && chrome == null){
			System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
			driver =  new ChromeDriver();
			chrome=driver;
		}else if(browserType.equals("chrome") && chrome != null){
			driver=chrome;
		}
		
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Navigate to URL
	public void navigate(String URL){
		driver.get(CONFIG.getProperty(URL));
	}
	
	//clicking on any object
	//U can create any other way you to want to click on object -- we are taking xpath here
	//U can create multiple click functions
	public void click(String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	
	public void click_id(String objectName){
		driver.findElement(By.id(OR.getProperty(objectName))).click();
	}
	
	public void type(String text, String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).clear();
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public void select(String text, String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public boolean isElementPresent(String objectName){
       int size = 0;
		
		try {
			//size = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
			size = driver.findElements(By.id(OR.getProperty(objectName))).size();
		} catch (Exception e) {
			
		}
		if(size>0)
			return true;
		else
			return false;
	}
	
	public boolean isElementPresent_Xpath(String objectName){
	       int size = 0;
			
			try {
				size = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
			} catch (Exception e) {
				
			}
			if(size>0)
				return true;
			else
				return false;
		}

	//**************************APPLICATION DEPENDENT FUNCTIONS****************************
	
	//implement singleton behavior
	public static WebConnector getInstance(){
		if (w == null)
			w = new WebConnector();
		return w;
	}
	
	//function to check if user is logged into application
	public boolean isLoggedIn(){
		if(isElementPresent("choice")){
			click_id("choice");
			return true;
		}
		else{
			return false;
		}
	}
	
	//method to
	public void doDefaultLogin(){
		navigate("loginURL");
		type(CONFIG.getProperty("adminusername"), "usrname");
		type(CONFIG.getProperty("adminpassword"), "passwrd");
		click("loginbutton");
		click_id("choice");
	}
}
