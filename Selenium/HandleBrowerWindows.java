package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowerWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//get Window Handle
		/*String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.close();*/
		Thread.sleep(3000);
		//get WindowHandles
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowsID = driver.getWindowHandles(); //it returns the ids of multiple browsers
		//first method using iterator
		/*Iterator<String> it = windowsID.iterator();
		 * 
		String parentwindowID = it.next();
		String childwindowID = it.next();
		
		System.out.println("parentID :"+parentwindowID);
		System.out.println("childID :"+childwindowID);*/
		
		//second method --->converting set to list
		
		List<String> windowsIDList = new ArrayList(windowsID);
		
		
		/*String parentwindowID = windowsIDList.get(0);
		String childwindowID = windowsIDList.get(1);
		
		System.out.println("parentID :"+parentwindowID);
		System.out.println("childID :"+childwindowID);
		
		//How to use windowIDs for switching
		driver.switchTo().window(parentwindowID);
		System.out.println("parent window Title:"+driver.getTitle());
		
		driver.switchTo().window(childwindowID);
		System.out.println("child window title:"+driver.getTitle());*/
		
		//for each loop
		for(String winid:windowsIDList)
		{
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
		//driver.close();
		//driver.quit();
		
		
		
		
		
	}

}
