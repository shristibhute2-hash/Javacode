// Write a xpath on amazon search text box and search shoes
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAmazonSearchShoe_122 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoes");
		Thread.sleep(3000);
		driver.quit();
	}

}
