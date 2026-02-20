package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasetextinAnotherComponent_127 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Shristi");
		Thread.sleep(3000);
		firstname.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(3000);
		firstname.sendKeys(Keys.CONTROL + "c");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys(Keys.CONTROL + "v");

	}

}
