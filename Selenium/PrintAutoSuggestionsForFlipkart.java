package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionsForFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> allsuggests = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		int count = allsuggests.size();
		System.out.println("print the count of suggestions :"+count);
		for(int i=0;i<count;i++) {
			String text = allsuggests.get(i).getText();
			System.out.println(text);
		
		}
		allsuggests.get(2).click();
		driver.close();

	}

}
