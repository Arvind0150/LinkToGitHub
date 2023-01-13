package com.qa.pageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardForSell extends TestBase{
	
	public DashboardForSell ()
	{
		PageFactory.initElements(driver, this);
	}
	
	//search_box
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_boxSell;
	
	public void enterInSearchBox(String CompanyName)
	{
		search_boxSell.sendKeys(CompanyName);
	}
	
	//option
	@FindBy(partialLinkText="Bitcoin Diamond")
	private WebElement optionBitcoin;
	
	public void clickOnOption()
	{
		Actions act =new Actions(driver);
		act.moveToElement(optionBitcoin).click().build().perform();
	}

	
	

}
