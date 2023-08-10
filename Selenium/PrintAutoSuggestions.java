package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allsuggests = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsuggests.size();
		for(int i=0;i<count;i++) {
			String text = allsuggests.get(i).getText();
			System.out.println(text);
		
		}
		allsuggests.get(3).click();

	}

}
