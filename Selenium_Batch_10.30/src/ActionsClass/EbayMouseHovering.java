package ActionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayMouseHovering {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement healthAndBeauty = driver.findElement(By.xpath("//a[.='Health & Beauty']"));
		Actions a = new Actions(driver);
		a.moveToElement(healthAndBeauty).perform();

		driver.findElement(By.xpath("//a[.='Massagers']")).click();
		driver.quit();
	}

}
