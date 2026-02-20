//WAP to Open Google and click on "About"
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleAndClick_117 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("About")).click();
		Thread.sleep(2000);
	}

}
