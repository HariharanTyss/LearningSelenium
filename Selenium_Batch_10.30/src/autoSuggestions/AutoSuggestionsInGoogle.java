package autoSuggestions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsInGoogle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("seleni");
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li/descendant::span"));
		
		for(WebElement w : autoSuggestions) {
			System.out.println(w.getText());
		}
		driver.quit();
	}

}
