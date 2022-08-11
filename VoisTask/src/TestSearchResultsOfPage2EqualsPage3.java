import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestSearchResultsOfPage2EqualsPage3 {
	@Test
	
	void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
  				"G:\\Software Testing Engineer\\Selenium\\Web driver\\geckodriver.exe");
  		WebDriver driver = new FirefoxDriver();
  		
  		driver.get("https://www.google.com");
  		driver.manage().window().maximize();
  		
  		driver.findElement(By.name("q")).sendKeys("Vodafone");
  		Thread.sleep(1000);
  		driver.findElement(By.className("gNO89b")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[4]/div/div[2]/table/tbody/tr/td[3]/a")).click();
  		List<WebElement> page2ResultsCount = driver.findElements(By.tagName("h3"));
  		Thread.sleep(1000);
  		int page2 = page2ResultsCount.size()-1;
  		
  		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div/div[4]/div/div[2]/table/tbody/tr/td[4]/a")).click();
  		List<WebElement> page3ResultsCount = driver.findElements(By.tagName("h3"));
  		int page3 = page3ResultsCount.size()-1;
  		
  		driver.quit();
  	
  		System.out.println("Number of search results in Page2 = " + page2);
  		System.out.println("Number of search results in Page3 = " + page3);
  		
  		if (page2 == page3) {
  			System.out.println("Number of search results in Page2 equals Page3");
  		} else System.out.println("Number of search results in Page2 does not equal Page3");
  		
  		int expected = page2=page3;
  		int actual = 10;
  		
		assertEquals(expected, actual);

	}

}
