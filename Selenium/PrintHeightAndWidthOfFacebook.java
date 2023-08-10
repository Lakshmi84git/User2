package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidthOfFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int height = driver.findElement(By.id("email")).getSize().getHeight();
		int width = driver.findElement(By.id("email")).getSize().getWidth();
		System.out.println("Height of Email box :"+height);
		System.out.println("Width of Email box :"+width);
		
		

	}

}
