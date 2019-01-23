package com.qa.SeleniumNewMethod;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HotelsPage {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[4]/a")
	private WebElement nextPage;
	
	public void searchFor(String text, String number, WebDriver driver, Actions Action) throws InterruptedException, AWTException {
	
		Boolean londonExists = false;
		while(londonExists == false) {
		List<WebElement> list = driver.findElements(By.xpath("//*[@title=\""+text+"\"]"));
		if (list.size() > 0){
			londonExists = true;
			WebElement parent = list.get(0).findElement(By.xpath(".."));
			WebElement link = parent.findElement(By.cssSelector("h4"));
			Thread.sleep(10);
			link.click();
		}
		else {
			nextPage.click();
		}
		}
	}
	
} 
