package com.crm.genericutiity;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectrepository.HomepagePOM;
import com.crm.objectrepository.LoginPOM;

public class BaseClass {
	

	public WebDriverUtility wlb=new WebDriverUtility();
	public JavaUtility jlb=new JavaUtility();
	public TestDataUtility tlb=new TestDataUtility();
	public CommonDataUtility clb=new CommonDataUtility();
    public WebDriver driver=null;
	@BeforeSuite
	public void BS(){
		System.out.println("====Database open===");
	}
	
	@BeforeClass
	public void BC() throws IOException {
		String browser=clb.getCommonData("Browser");
		driver=wlb.getLaunchBrowser(browser);
		wlb.getImplicitWait(driver, 10);
		String url=	clb.getCommonData("Url");
		driver.get(url);
		wlb.getMaximize(driver);
		System.out.println("Browser open successfully......");
	}
	@BeforeMethod
	public void BM() throws IOException{
		
		String username=clb.getCommonData("Username");
		String password=clb.getCommonData("Password");
		LoginPOM lp=new LoginPOM(driver);
		lp.getLogin(username, password);
		System.out.println("Login successfully with valid credentials....");
	}
	@AfterMethod
	public void AM() {
		HomepagePOM hp=new HomepagePOM(driver);
		hp.getLogoutedt();
		System.out.println("Loggedout successfully...");
	}
	
	@AfterClass
	public void AC() {
		driver.quit();
		System.out.println("Browser closed successfully.....");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("===Database closed====");
	}
}
