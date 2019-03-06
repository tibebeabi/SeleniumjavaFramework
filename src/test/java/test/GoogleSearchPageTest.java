package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearchTest();

	}

	public static void googleSearchTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\taber\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		GoogleSearchPageObjects searchpageObj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.com");

		searchpageObj.setTextInSearchBox("A B C D");

		searchpageObj.clickSearchButton();

		driver.close();

	}
}
