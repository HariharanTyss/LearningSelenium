package testScriptsUsingpom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.InstagramLoginPage;

public class InstagramLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		InstagramLoginPage loginPage = new InstagramLoginPage(driver);
		loginPage.passDataToUserName("9177432389");
		loginPage.passDataToPassword("123456");
		loginPage.clickLogin();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
