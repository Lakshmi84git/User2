package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		/*--------FindElement
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchStore.sendKeys("XYZ");
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-block my-account']//a"));
		System.out.println(ele.getText());
		
		WebElement searchbutton = driver.findElement(By.xpath("//div[@class='footer-block log in']"));
		*/
		
		
		/* FindElements  */
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer']//a"));
		System.out.println("number of elements:"+links.size());
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
		//List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println( logo.size());
		

	}

}
