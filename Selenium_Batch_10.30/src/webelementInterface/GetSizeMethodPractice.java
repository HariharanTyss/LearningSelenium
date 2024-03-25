package webelementInterface;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		WebElement searchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension size = searchTextField.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Height of the element : "+height);
		System.out.println("Width of the element : "+width);
		driver.quit();

	}

}
