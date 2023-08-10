package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("checkbox is selected");
			
		}
		else {
			System.out.println("checkbox is not selected");
			
			
		}
		//driver.close();

	}

}
