package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignmentForActitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		int a = driver.findElement(By.name("username")).getLocation().getX();
		int b = driver.findElement(By.name("pwd")).getLocation().getX();
		if(a==b)
		{
			System.out.println("Properly Aligned");
		}
		else {
			System.out.println("Not Properly Aligned");
		}
		driver.close();
		
		/*https://omayo.blogspot.com/
		
		driver.get("https://omayo.blogspot.com/");
		int a = driver.findElement(By.name("userid")).getLocation().getX();
		int b = driver.findElement(By.name("pswrd")).getLocation().getX();
		if(a==b)
		{
			System.out.println("Properly Aligned");
		}
		else {
			System.out.println("Not Properly Aligned");
		}  */
		

	}

}
