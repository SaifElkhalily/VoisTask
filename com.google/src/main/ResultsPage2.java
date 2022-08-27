package main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.BaseClass;

public class ResultsPage2 {
	public int countSearchResults() {
		List<WebElement> page2ResultsCount = BaseClass.getWebDriver().findElements(By.tagName("h3"));
		return page2ResultsCount.size();
	}
	public void clickOnPage3() {
		BaseClass.getWebDriver().findElement(By.xpath("//a[@aria-label='Page 3']")).click();
	}

}
