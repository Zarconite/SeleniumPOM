package com.qa.SeleniumNewMethod;
import com.qa.SeleniumNewMethod.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

import java.awt.AWTException;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {

	WebElement element;
	WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	@Before
	public void setup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Data\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
	}
	
	@Test
    public void openGoogleAndSearch() throws InterruptedException, AWTException{
		report = new ExtentReports("C:\\Data\\report.html", true);
		test = report.startTest("Verify booking a hotel room works");
		
		driver.get("https://www.phptravels.net/");
		test.log(LogStatus.INFO, "Browser started");
		
		Actions Action = new Actions(driver);
		
		try {
		test.log(LogStatus.INFO, "Filling in the landing page..");
		PhpTravelsLandingPage landingPage = PageFactory.initElements(driver, PhpTravelsLandingPage.class);
		landingPage.searchFor("London","3",driver,Action);
		test.log(LogStatus.PASS, "Landing page complete!");
		
		test.log(LogStatus.INFO, "Searching for a hotel in London..");
		HotelsPage hotelsPage = PageFactory.initElements(driver, HotelsPage.class);
		hotelsPage.searchFor("London","3",driver,Action);
		test.log(LogStatus.PASS, "London hotel has been found!");
		
		test.log(LogStatus.INFO, "Re-filling in the dates/adult count..");
		LondonHotelPage londonHotelPage = PageFactory.initElements(driver, LondonHotelPage.class);
		londonHotelPage.searchFor("London","3",driver,Action);
		test.log(LogStatus.PASS, "Complete!");
		
		test.log(LogStatus.INFO, "Filling in person information..");
		BookingPage BookingPage = PageFactory.initElements(driver, BookingPage.class);
		BookingPage.searchFor("London","3",driver,Action);
		test.log(LogStatus.PASS, "Complete!");
		
		test.log(LogStatus.INFO, "Gathering Result..");
		ConfirmPage ConfirmPage = PageFactory.initElements(driver, ConfirmPage.class);
		assertEquals("Result should be Unpaid", "UNPAID", ConfirmPage.result(driver));
		test.log(LogStatus.PASS, "Test Complete!");
		
		test.log(LogStatus.PASS, "Result should be Unpaid | Expected: " + "UNPAID" + " | Actual: " + ConfirmPage.result(driver));
		
		}
		catch(Exception e){
			test.log(LogStatus.FATAL, "Error has occured!", e);
		}
		report.endTest(test);
		report.flush();
    }
	
	@After
	public void end() {
		driver.quit();
	}
}
