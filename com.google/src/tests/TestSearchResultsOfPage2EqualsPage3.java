package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.HomePage;
import main.ResultsPage1;
import main.ResultsPage2;
import main.ResultsPage3;

public class TestSearchResultsOfPage2EqualsPage3 {
	@BeforeTest
	public void setUp() {
		BaseClass bc = new BaseClass();
		bc.setUp();
	}
	
	@Test
	public void searchResultsOfPage2EqualsPage3Test() {
		BaseClass bc = new BaseClass();
		HomePage hp = new HomePage();
		ResultsPage1 p1 = new ResultsPage1();
		ResultsPage2 p2 = new ResultsPage2();
		ResultsPage3 p3 = new ResultsPage3();
		BaseClass.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.searchBox();
		hp.clickOnSearchButton();
		bc.scrollDown();
		p1.clickOnPage2();
		bc.scrollDown();
		p2.clickOnPage3();
		
		boolean expected = p2.countSearchResults() == p3.countSearchResults();
		assertTrue(expected);
		System.out.println("Number of search results of Page2 = " + (p2.countSearchResults()-1));
		System.out.println("Number of search results of Page3 = " + (p3.countSearchResults()-1));
	}
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().quit();
	}

}
