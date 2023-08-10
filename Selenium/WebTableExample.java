package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		//finding the rows in table
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("The Total number of rows:"+rows);
		
		//finding the columns in table
		int col = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th")).size();
		System.out.println("The Total number of columns:"+col);
		
		//Retriveing the particular row/column data
		String value = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]//td[1]")).getText();
		System.out.println("the value is : "+value);
		
		//retriving all the data from table
		
		/*System.out.println("Data of the table......");
		for(int r=1;r<rows;r++)
		{
			
			for(int c=1;c<col;c++)
			{
				String data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"      ");
			}
			System.out.println();
		}*/
		
		
		//retriving particular data from table
		
		for(int r=1;r<=rows;r++)
		{
			String Company = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]//td[1]")).getText();
			if(Company.equals("NCC"))
			{
				String Group = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]//td[2]")).getText();
				String CurentPrice = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]//td[4]")).getText();
				System.out.println(Company+"       "+Group+"      "+CurentPrice);
				
			}
			
		}
		
		
	driver.close();
		
		
		

	}

}
