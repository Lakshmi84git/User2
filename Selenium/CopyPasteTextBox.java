package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		

	}

}
