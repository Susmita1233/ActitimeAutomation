package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
//	String name;
//	public LoginPOM(String name) {
//		this.name=name;
//	}
//	
//	public static void main(String[] args) {
//			LoginPOM pom=new LoginPOM("inu");
//			System.out.println(pom.name);
//	}
		//initialization
	
		public LoginPOM(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		//declaration
		@FindBy(xpath = "//input[@name='username']")
		private WebElement useredt;
		
		@FindBy(xpath = "//input[@name='pwd']")
		private WebElement passwordedt;
		
		@FindBy(xpath = "//div[text()='Login ']")
		private WebElement loginedt;
//		utilization
		public WebElement getUseredt() {
			return useredt;
		}

		public WebElement getPasswordedt() {
			return passwordedt;
		}

		public WebElement getLoginedt() {
			return loginedt;
		}
		
	//Business logic method
		
		public void getLogin(String username,String password) {
			useredt.sendKeys(username);
			passwordedt.sendKeys(password);
			loginedt.click();
		}
		
		
		
	
}
