package drivers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		List<WebElement> list = driver.findElements(By.xpath("//li[@classs='sbct']//div[@role='option']//div[1]/span"));
		System.out.println("Size of Auto suggestions : "+list.size());
		
		

	}

}
