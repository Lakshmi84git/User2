package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//1.for selecting one checkbox
		//driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		//2.for select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
		System.out.println("Total no.of checboxes : "+checkboxes.size());
		//using for loop
		/*for(int i=0;i<=checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		/*using for each loop
		for(WebElement chbox:checkboxes) {
			chbox.click();
		}*/
		
		//3.select multiple checkboxes by choice(we need to select tuesday nd friday)
		
		/*for(WebElement chbox:checkboxes)
		{
			String checkboxname = chbox.getAttribute("id");
			if(checkboxname.equals("tuesday")||(checkboxname.equals("friday"))){
				chbox.click();
			}
		}*/
		//4.select last 2 checkboxes
		int totalcheckboxes = checkboxes.size();
		/*for(int i=totalcheckboxes-2;i<totalcheckboxes;i++) {
			checkboxes.get(i).click();
		}*/
		//5.select first 2 checkboxes
		for(int i=0;i<totalcheckboxes;i++) {
			if(i<2) {
				checkboxes.get(i).click();
			}
		}

	}

}
