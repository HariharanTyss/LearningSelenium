package testScriptsUsingpom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.GooglePage;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		GooglePage google = new GooglePage(driver);
		google.getSearchTextField().sendKeys("phone");
		Thread.sleep(2000);
		driver.quit();
	}

}
