package ActionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSkillraryApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement courseTab = driver.findElement(By.partialLinkText("COURSE"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Selenium")).click();
		//driver.quit();
	}

}
