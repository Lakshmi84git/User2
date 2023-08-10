package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextForgotPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		//driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).getText();
		//driver.findElement(By.linkText("")
		
		//Print Attribute 
		String tagname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("id");
		String href = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		//System.out.println("Forgot Passwword");
		System.out.println(tagname);
		System.out.println(href);
		driver.close();

	}

}
