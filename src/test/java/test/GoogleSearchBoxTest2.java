package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchBoxTest2 {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();

	}

	public static void googleSearch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\taber\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// goto google.com
		driver.get("https://google.com");

		// enter text in search textbox
		// driver.findElement(By.name("q")).sendKeys("Automatic step by step");

		// POM test
		GoogleSearchPage.textbox_search(driver).sendKeys("Automatic step by step");

		// click on search button
		// driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);

		// GoogleSearchPage.button_search(driver).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		// close browser
		driver.close();

		System.out.println("Test completed Successfully");

	}
}
