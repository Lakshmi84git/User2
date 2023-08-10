package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOfForgottenPwdForFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		String fontsize = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		//String color2 = driver.findElement(By.name("login")).getCssValue("color");
		System.out.println("color of Forgotten Password :"+color);
		//System.out.println("color of Login is :"+color2);
		driver.close();
		

	}

}
