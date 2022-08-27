package main;

import org.openqa.selenium.By;

import tests.BaseClass;

public class HomePage {
	public void searchBox() {
		BaseClass.getWebDriver().findElement(By.name("q")).sendKeys("Vodafone");
	}
	public void clickOnSearchButton() {
		BaseClass.getWebDriver().findElement(By.cssSelector("div[class='FPdoLc lJ9FBc']>center>input[value='Google Search']")).click();
	}

}
