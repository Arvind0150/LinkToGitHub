package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class TradingPageForSell extends TestBase {
	
	public TradingPageForSell()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//sellOption
	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement sellOption;
	
	public void clickOnSellOption()
	{
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(sellOption).click().build().perform();
		//sellOption.click();
	}
	
	
	//quantity
     @FindBy(xpath="(//input[@class='form-control form-control'])[1]")
    	private WebElement quantityBox;
     
     public void enterInQuantity(String count)
     {
    quantityBox.sendKeys(count);	 
     }
     
     //sellButton
     
     @FindBy(xpath="//button[@class='w-md btn btn-danger']")
     private WebElement sellButton;
     
     public void clickOnSellButton()
     {
    	 sellButton.click();
     }
    		 
    		 
}
















