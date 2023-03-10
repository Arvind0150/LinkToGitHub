
package com.qa.pageLayer;

import org.openqa.selenium.By;  

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FlipCart extends TestBase {
	
	public FlipCart()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement close;
	
	public void clickOnClose()
	{
		close.click();
	}
	
	@FindBy(xpath=("(//div[@class=\"xtXmba\"])[9]"))
	private WebElement beauty;
	
	public void clickOnBeauty()
	{
		beauty.click();
	
	}	
	
	
	
	
@FindBy(xpath=("//div[@class=\"_6t1WkM _3HqJxg\"]"))
	private WebElement banner;
	
	public void clickOnBanner()
	{
		banner.click();
	
	}	
	
	@FindBy(xpath=("(//span[@class=\"_2I9KP_\"])[1]"))
	private WebElement electronics;
	
	public void moveToElectronics()
	{
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
	
	}	
	
	@FindBy(xpath=("//a[@title='Mobiles']"))
	private WebElement mobiles;
	
	public void moveToMobiles()
	{
		Actions act = new Actions(driver);
		act.moveToElement(mobiles).perform();
	
	}	
	
}
	


















	



