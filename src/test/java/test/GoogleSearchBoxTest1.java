package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBoxTest1 {
	public static void main(String[] args) {
		googleSearch();

	}

	public static void googleSearch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\taber\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// goto google.com
		driver.get("https://google.com");

		// enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automatic step by step");

		// click on search button
		driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);

		// close browser
		driver.close();

		System.out.println("Test completed Successfully");

	}
}
