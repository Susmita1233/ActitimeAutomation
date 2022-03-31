package com.crm.genericutiity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * 
	 * @param driver
	 * @param time
	 */
	
	public void getImplicitWait(WebDriver driver,int time) {
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
		/**
		 * 
		 * @param driver
		 * @param time
		 * @param element
		 */
	public void getExplicitWaitToClick(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	public void getExplictWaitToVisible(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		/**
		 * 
		 * @param driver
		 */
	public void getMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * 
	 * @param driver
	 * @param browser
	 * @return
	 */
	public WebDriver getLaunchBrowser(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}else {
			driver=new InternetExplorerDriver();
		}
			return driver;
		
	}
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void getDropDownByVisibleText(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void getMouseAction(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
}
