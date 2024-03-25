package webelementInterface;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethodPractice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LedTV");
		//driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.quit();

	}

}
