package dropdowns;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(allDropdown);
		List<WebElement> options = s.getOptions();
		
		for(WebElement w : options) {
			System.out.println(w.getText());
		}
		driver.quit();
	}

}
