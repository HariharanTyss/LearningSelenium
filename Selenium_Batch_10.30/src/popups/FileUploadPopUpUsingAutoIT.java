package popups;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Register']")).click();
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\sncsr\\OneDrive\\Desktop\\New folder\\uploadPopup.exe");

		Thread.sleep(8000);
		driver.quit();
	}

}
