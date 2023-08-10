package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdowns {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver1.exe" );
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		//Approach1
		//Select noOfEmpdrp = new Select(driver.findElement(By.name("NoOfEmployees")));
		//noOfEmpdrp.selectByVisibleText("16 - 20");
		//Select country=new Select(driver.findElement(By.name("Country")));
		//country.selectByVisibleText("Aruba");
		
		//Approach2
		WebElement noOfEmp=driver.findElement(By.name("NoOfEmployees"));
		SelectOptionFromDropDown(noOfEmp,"51 - 75");
		
		WebElement country =driver.findElement(By.name("Country"));
		SelectOptionFromDropDown(country,"Aruba");
		
		
		

	}
    public static void SelectOptionFromDropDown(WebElement ele,String value)
    {
    	Select drp = new Select(ele); 
    	List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
    }
    
}
