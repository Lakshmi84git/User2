package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class VerifyFacebookLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("Logo is Displyed");
			
		}
		else {
			System.out.println("Logo is not Displayed");
			
		}
		driver.close();

	}
	

}
