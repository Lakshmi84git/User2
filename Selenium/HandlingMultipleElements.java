package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for(int i = 0;i<count;i++) {
			String text = links.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();

	}

}
