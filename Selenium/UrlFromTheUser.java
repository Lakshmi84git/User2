package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlFromTheUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL :");
		String url = sc.nextLine();
		WebDriver driver1 = new ChromeDriver();
		driver1.get(url);
		

	}

}
