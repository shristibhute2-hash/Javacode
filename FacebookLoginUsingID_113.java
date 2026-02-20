package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginUsingID_113 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("shristibhute5@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shristi@123");
		driver.findElement(By.name("login")).click();
	}

}
