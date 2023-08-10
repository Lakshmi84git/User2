package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/INDIAN/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		s.selectByVisibleText(" idly ");
		//Thread.sleep(3000);
		s.selectByIndex(1);
		//Thread.sleep(3000);
		s.selectByValue("c");
		//Thread.sleep(3000);
		//s.deselectByIndex(1);
		//Thread.sleep(3000);
		//s.deselectByValue("l");
		//Thread.sleep(3000);
		//s.deselectByVisibleText(" dosa ");
		//Thread.sleep(3000);
		//s.deselectAll();
		/*WebElement o = s.getFirstSelectedOption();
		String e = o.getText();
		System.out.println(e);*/
		
		
		/*List<WebElement> alloptions = s.getAllSelectedOptions();
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
		}
		
		List<WebElement> all = s.getOptions();
		for(WebElement ele:all)
		{
			System.out.println(ele.getText());
		}*/
		
		
		/*List<WebElement> all2 = (List<WebElement>) s.getWrappedElement();
		for(WebElement ele:all2)
		{
			System.out.println(ele.getText());
		}*/
		
		
		if(s.isMultiple()) {
			System.out.println("select tag allows multiple options");
		}
		else {
			System.out.println("select tag does'nt allows multiple options");
		}
		
		
		
		
		
		Thread.sleep(3000);
		//driver.close();

	}

}
