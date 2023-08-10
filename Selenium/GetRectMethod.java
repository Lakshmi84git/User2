package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Rectangle a = driver.findElement(By.name("username")).getRect();
		Rectangle b = driver.findElement(By.name("pwd")).getRect();
		Rectangle c = driver.findElement(By.name("username")).getRect();
		System.out.println(a.height + c.x);
		System.out.println(b.height + b.x);
		

	}

}
