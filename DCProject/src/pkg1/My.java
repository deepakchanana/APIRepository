package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My {
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();  // Chromedriver object
	driver.get("https://www.facebook.com"); // url hit
	driver.manage().window().maximize(); // maximize the browser
	WebElement drop=driver.findElement(By.cssSelector("select[title='Year']")); // drop down located
	Select s=new Select(drop); // Select class object created
	s.selectByIndex(9); // used the index number technique
	
	
		
	}

}
