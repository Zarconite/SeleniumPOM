package com.qa.SeleniumNewMethod;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LondonHotelPage {
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[1]/div/input")
	private WebElement checkIn;
			
	@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[5]/td[3]")
	private WebElement checkInDate;
			
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input")
	private WebElement checkOut;
	
	@FindBy(xpath = "/html/body/div[12]/div[1]/table/tbody/tr[5]/td[5]")
	private WebElement checkOutDate;
	
	@FindBy(id = "adults")
	private WebElement adultCount;
	
	@FindBy(xpath = "//*[@id=\"adults\"]/option[3]")
	private WebElement adultCountSetToThree;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[5]/input[3]")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[1]")
	private WebElement clickOff;
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div")
	private WebElement selectHotel;
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/button")
	private WebElement bookNow;
	
	public void searchFor(String text, String number, WebDriver driver, Actions Action) throws InterruptedException, AWTException {
		
		checkIn.click();
		checkInDate.click();
		checkOut.click();
		checkOutDate.click();
		checkOut.click();
		checkOut.sendKeys(Keys.TAB,number);
		submit.click();
		Action.moveToElement(bookNow, 0, 0).perform();
		selectHotel.click();
		bookNow.click();
		
	}
	
	
}