package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPagePO {
	
	private WebDriver Driver;

	public FlightPagePO(WebDriver driver) {
		
		this.Driver=driver;
		PageFactory.initElements(Driver, this);

	}
	@FindBy(xpath = "//span[@class='pointer']//span[contains(text(),'Price')]")
	public WebElement price;
	
	
	@FindBy(xpath = "//div[@class='listingCard']")
	public List<WebElement> allflights;
	
	
	
	
	public void FilterByPrice()
	{
		price.click();
	}
	
	public void flights()
	{
		for(WebElement var:allflights)
    	{
    		System.out.println(var.getText());
    		
    		
    	}
	}
	

}
