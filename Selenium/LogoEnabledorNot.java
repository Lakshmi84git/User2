package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoEnabledorNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
		
		if(button==true)
		{
			System.out.println("button is Enabled");
			
		}
		else {
			System.out.println("button is not Enabled");
			
		}
		driver.close();

	}

}
