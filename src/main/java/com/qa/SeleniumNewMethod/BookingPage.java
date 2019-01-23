package com.qa.SeleniumNewMethod;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BookingPage {

	@FindBy(xpath = "//*[@id=\"guestform\"]/div[1]/div[2]/input")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[1]/div[3]/input")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[2]/div[2]/input")
	private WebElement eMail;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[2]/div[3]/input")
	private WebElement eMailConfirm;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[3]/div[2]/input")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[4]/div[2]/input")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen1\"]/a")
	private WebElement country;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[4]/button")
	private WebElement confirmButton;
	
	
	public void searchFor(String text, String number, WebDriver driver, Actions Action) throws InterruptedException, AWTException {
	
		firstName.click();
		firstName.sendKeys("Test");
		lastName.click();
		lastName.sendKeys("Test");
		eMail.click();
		eMail.sendKeys("Test@Test.Test");
		eMailConfirm.click();
		eMailConfirm.sendKeys("Test@Test.Test");
		phoneNumber.click();
		phoneNumber.sendKeys("+44 7700 900796");
		address.click();
		address.sendKeys("7, Test Street");
		country.click();
		country.sendKeys("united k",Keys.ENTER);
		confirmButton.click();
		
	}
	
}
