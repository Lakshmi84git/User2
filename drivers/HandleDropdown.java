package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver1.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement dryCountryEle = driver.findElement(By.id("Form_getForm_Country"));
		Select dryCountry = new Select(dryCountryEle);
		
		//dryCountry.selectByVisibleText("Denmark");
		//dryCountry.selectByValue("Aruba");
		//dryCountry.selectByIndex(13);
	    
		//selecting option from dropdown without using methods
		List<WebElement>alloptions=dryCountry.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Denmark"))
			{
				option.click();
				break;
			}
		}
		
		
	}

}