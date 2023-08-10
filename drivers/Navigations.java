package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back();//snapdeal page
		driver.navigate().forward();//amazon page
		driver.navigate().refresh();//refreh the page 
		Thread.sleep(3000);
		driver.close();
		

	}

}
