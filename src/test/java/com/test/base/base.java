package com.test.base;

import org.openqa.selenium.WebDriver;

public class base {
	
	protected String url=ConfigHelper.INSTANCE.getProperty("Url");
	protected static String days=ConfigHelper.INSTANCE.getProperty("NoOfdays");
	
	protected WebDriver driver =Webdriverfactory.getDriver();
	

}
