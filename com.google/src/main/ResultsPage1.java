package main;

import org.openqa.selenium.By;

import tests.BaseClass;

public class ResultsPage1 {
	public void clickOnPage2() {
		BaseClass.getWebDriver().findElement(By.xpath("//a[@aria-label='Page 2']")).click();
	}

}
