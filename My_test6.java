import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INDIAN\\eclipse-workspace\\Test6\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		//isDisplayed isEnabled
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status:"+searchStore.isDisplayed());//true
		System.out.println("Enable status:"+searchStore.isEnabled());//true
		
		//isSelected
		WebElement male = driver.findElement(By.xpath("//label[@for='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		
		male.click();
		System.out.println(male.isSelected());//True
		System.out.println(female.isSelected());//False
		
		female.click();
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//True
		
	

	}

}
