package com.qa.SeleniumNewMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmPage {
	
	@FindBy(xpath = "//*[@id=\"invoiceTable\"]/tbody/tr[1]/td/div")
	private WebElement unpaid;
	
	public String result(WebDriver driver) {
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 15)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[1]/td")));
		return unpaid.getAttribute("innerText");
		
	}
}
