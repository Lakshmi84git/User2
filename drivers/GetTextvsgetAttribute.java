package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextvsgetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailinputbox = driver.findElement(By.id("Email"));
		//emailinputbox.clear();
		//emailinputbox.sendKeys("xyz123@gmail.com");
		System.out.println("Result from getAttribute() method:" + emailinputbox.getAttribute("value"));

	}

}
  