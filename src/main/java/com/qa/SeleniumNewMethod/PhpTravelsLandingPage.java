package com.qa.SeleniumNewMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsLandingPage {

		@FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div")
		private WebElement searchBoxSpan;
	
		@FindBy(className = "select2-input")
		private WebElement searchBox;

		@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
		private WebElement checkIn;
		
		@FindBy(xpath = "/html/body/div[9]/div[1]/table/tbody/tr[5]/td[3]")
		private WebElement checkInDate;
		
		@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[4]/td[5]")
		private WebElement checkOutDate;
		
		@FindBy(xpath = "//*[@id=\"travellersInput\"]")
		private WebElement peopleSection;
		
		@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[5]/td[5]")
		private WebElement adultInput;
		
		@FindBy(xpath = "//*[@id=\"hotels\"]/form/div[5]/button")
		private WebElement searchButton;
		
		public void searchFor(String text, String number, WebDriver driver, Actions Action) throws InterruptedException, AWTException {
			
			searchBoxSpan.click();
			Action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
			Action.sendKeys(text).perform();
			WebElement myDynamicElement2 = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div/span")));
			Action.sendKeys(Keys.RETURN).perform();
			checkIn.click();
			checkInDate.click();
			checkOutDate.click();
			WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"adultInput\"]")));
			peopleSection.click();
			Action.sendKeys(Keys.TAB,Keys.TAB,Keys.BACK_SPACE+number+Keys.RETURN);
			searchButton.click();
			
		}

}
