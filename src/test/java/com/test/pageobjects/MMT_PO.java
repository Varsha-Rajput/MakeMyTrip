package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT_PO {
	
	private WebDriver Driver;

	public MMT_PO(WebDriver driver) {
		
		this.Driver=driver;
		PageFactory.initElements(Driver, this);

	}
	
	@FindBy(xpath = "//label[@for='fromCity']")
	public WebElement fromCity;
	
	@FindBy(xpath = "//*[normalize-space()='To']")
	public WebElement toCity;
	
	@FindBy(xpath = "//input[contains(@placeholder,'From')]")
	public WebElement fromCityPlaceholder;
	
	@FindBy(xpath = "div[@class='makeFlex hrtlCenter appendBottom20 flightFare']")
	public WebElement Popup;
	
	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	public WebElement closePopup;
	
	@FindBy(xpath = "//div[@id='react-autowhatever-1']//li")
	public List<WebElement> toCityList;
	
	@FindBy(xpath = "//a[normalize-space()='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//span[normalize-space()='RETURN']]")
	public WebElement returnDate;
	
	@FindBy(xpath = "//div[@class='DayPicker-Day']//p[contains(text(),'31')]")
	public WebElement Date;
	
	
	
	
	
	
	
	public void EnterDepartureCity() throws InterruptedException
	{
		fromCity.click();
		Thread.sleep(1500);
		fromCityPlaceholder.sendKeys("pune");
		
	}
	
	public void EnterArrivalCity() throws InterruptedException
	{
		toCity.click();
		Thread.sleep(3500);
		if(Popup.isDisplayed())
		{
			handlePopup();
		}
		for(WebElement var:toCityList)
    	{
    		System.out.println(var.getText());
    		handlePopup();
    		if(var.getText().equals("Mumbai, India"))
    		{ 
    			var.click();
    			break; 
    			
    		}
    	}
    	
	 }
	
	public void handlePopup() throws InterruptedException
	{
		
		 
		closePopup.click();
	 }
    
		
	public void clickSearch()
	{
		
		searchButton.click();
	}
	
	public void clickreturnDate()
	{
		
		returnDate.click();
		Date.click();
	}
	}
	


