package webelementInterface;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkBox.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		driver.quit();
	}

}
