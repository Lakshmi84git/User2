package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();*/
		
		

	}

}
