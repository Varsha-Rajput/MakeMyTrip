package com.test.stepdefination;

import com.test.base.Webdriverfactory;
import com.test.base.base;
import com.test.pageobjects.FlightPagePO;
import com.test.pageobjects.MMT_PO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MakeMyTripStepDefination extends base{
	
	
MMT_PO mmt =new MMT_PO(Webdriverfactory.getDriver());
FlightPagePO common =new FlightPagePO(Webdriverfactory.getDriver());

	
	
	@Given("Launch Application")
	public void Open_application() throws Throwable {
      System.out.print(url);
		
      driver.get(url);
	}
	
	@When("User Click on FromCity")
	public void clickFromCity() throws Throwable {
		
		mmt.EnterDepartureCity();
		
		
	}
	@When("User Click on ToCity")
	public void clickToCity() throws Throwable {
		mmt.EnterArrivalCity();
		
	}
	
	@When("User Selects Date")
	public void selectDate() throws Throwable {
		mmt.clickreturnDate();
		
	}
	

	@And("User Click On Search")
	public void clickOnSearch() throws Throwable {
		mmt.clickSearch();

	}

	@And("Flight List Diplays")
	public void displayFlightList() throws Throwable {
		
		common.FilterByPrice();
		common.flights();

	}
}
