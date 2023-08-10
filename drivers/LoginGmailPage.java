package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmailPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?elo=1&ifkv=Af_xneFOWCrXhVYa-GYwk5k7TH8nP5v7jJlxpdvr-VJkwVzlIqOm0-vgsSJNHbgL6oxX25Tbs3Mx&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("lakshmi84.lucky@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("luckylakshmi");
		Thread.sleep(3000);
		driver.close();
		

	}

}
