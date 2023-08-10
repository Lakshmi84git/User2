package drivers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement ele = driver.findElement(By.name("category_id"));
		
		Select drpselect = new Select(ele);
		List<WebElement>options = drpselect.getOptions();
		
		ArrayList originallist = new ArrayList();
		ArrayList templist = new ArrayList();
		
		for(WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());
			
		}
		
		System.out.println("Originaal List"+originallist);
		System.out.println("Temp List"+templist);
		
		Collections.sort(templist);
		
		System.out.println("Originaal List"+originallist);
		System.out.println("Temp List after sorting"+templist);
		if(originallist.equals(templist))
		{
			System.out.println("DropDown sorted");
		}
		else
		{
			System.out.println("DropDown Unsorted");
		}
		
		driver.close();
		
		

	}

}
