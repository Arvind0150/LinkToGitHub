
package com.qa.testLayer;

import java.time.Duration;  
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.pageLayer.FlipCart;
import com.qa.testBase.TestBase;

public class FlipCartPageTest extends TestBase {
	
		
		@Test
		public void verifyFlipCart() throws InterruptedException
		{
			
			
			
			
			Thread.sleep(2000);
			flip.clickOnClose();
			
			Thread.sleep(1000);
			
			flip.clickOnBeauty();
			
			Thread.sleep(1000);
			
			flip.clickOnBanner();
			
			flip.moveToElectronics();
			
			flip.moveToMobiles();
			
			

			
			
			
			Thread.sleep(1000);
			
			
			
			 List<WebElement> menuItems = driver.findElements(By.xpath("(//div[@class='_1fwVde'])[1]//a[@class='_3QN6WI']"));
			 
			// System.out.println(menuItems.size());
			 int j = 0;
			 for(int i =0; i<menuItems.size(); i++) 
			 {
				 j = i + 1;
			System.out.println(j + "."+ menuItems.get(i).getText());
			
	        
			 }
		}
}
			 
			 
			 
			 

			
			
		
			
			
			
			
			

			
			
			
		




