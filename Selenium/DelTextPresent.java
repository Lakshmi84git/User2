package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelTextPresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("textbox1")).clear();
		driver.findElement(By.id("textbox1")).sendKeys("Selenium");
		
		

	}

}
