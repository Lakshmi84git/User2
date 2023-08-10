package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretsPopupButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//alert with ok button
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
		//alert window with ok and cancel button
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();//for ok button
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);*/
		
		//Alert window with input box, capture text from alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("The msg displayed on window"+alertwindow.getText());
		alertwindow.sendKeys("Hello Lakshmi Welcome");
		alertwindow.accept();
		driver.close();
		
		

	}

}
