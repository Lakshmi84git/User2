package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeAndFontFamily {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		String fontsize = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		String family = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-family");
		String style = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-style");
		System.out.println("font-size of :"+fontsize);
		System.out.println("font-family of :"+family);
		System.out.println("font-style of :"+style);
		driver.close();
		
		

	}

}
