package main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.BaseClass;

public class ResultsPage3 {
	public int countSearchResults() {
		List<WebElement> page3ResultsCount = BaseClass.getWebDriver().findElements(By.tagName("h3"));
		return page3ResultsCount.size();
	}

}
