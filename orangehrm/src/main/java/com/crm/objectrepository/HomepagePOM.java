package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM {
	
	public HomepagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutedt;

	public WebElement getLogoutedt() {
		return logoutedt;
	}
	
}
