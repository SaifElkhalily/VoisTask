package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static WebDriver driver;
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
  				"G:\\Software Testing Engineer\\Selenium\\Web driver\\geckodriver.exe");
  		driver = new FirefoxDriver();
  		driver.get("https://www.google.com");
  		driver.manage().window().maximize();
	}
	public static WebDriver getWebDriver() {
		return driver;
	}
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getWebDriver();
        js.executeScript("window.scrollBy(0,350)", "");
	}

}
