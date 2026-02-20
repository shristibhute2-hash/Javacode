//How to handle a dropdown in case the component is not made with a select tagname?
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectTag_126 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		Thread.sleep(4000);
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

	}

}
