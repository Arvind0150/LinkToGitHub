package com.qa.testBase;



import java.time.Duration;   
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

//import com.qa.pageLayer.Dashboard;
//import com.qa.pageLayer.DashboardForSell;
import com.qa.pageLayer.FlipCart;
//import com.qa.pageLayer.LoginPage;
//import com.qa.pageLayer.TradingPage;
//import com.qa.pageLayer.TradingPageForSell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase<dashboard, tradingPage> {
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	//public LoginPage login;
	//public Dashboard dash;
	//public TradingPage trade;
	
	public FlipCart flip;
	
	//public TradingPageForSell sell;
	
//	public DashboardForSell dash2;
	

	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("InvestmentBanking.maven");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework exection Stopped");
	}
	
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 String br = "chrome";              
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if (br.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Please provide valid browser name");
		 }
		 
		// driver.get("https://www.apps.dalalstreet.ai/login"); 

		/* logger.info("url launches");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 logger.info("maximized browser");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 logger.info("provided waits");         
		 
		 */
		 
		// login = new LoginPage();
		// dash = new Dashboard();
		// trade = new TradingPage();
		 
		 
		 //Launching FlipCart.com
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 logger.info("maximized browser");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 logger.info("provided waits");  
		 Thread.sleep(3000);
		 
		 
		 
		
		 
	
		
		
		 
		 flip = new FlipCart();
		 
	/*	dash2 = new DashboardForSell();
		 //sell = new TradingPageForSell();
		    login.enterEmailAddress("rvndchavan2@gmail.com");
			login.enterPassword("015179112089");
			login.clickOnLoginButton();
			Thread.sleep(5000);*/
			
			
			
			
			
		
	}
	
	@AfterMethod
	public void tearDown()
	{
	//driver.quit();
		logger.info("Chrome closed");
	}
}


