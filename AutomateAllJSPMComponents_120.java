//Automate all components of JSAM Application using Absolute xpath
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateAllJSPMComponents_120 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/suraj/Desktop/Growtechminds/learningHTML1.html");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Username
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Shristi");
		Thread.sleep(1000);

		// Hint
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Hello");
		Thread.sleep(1000);

		// Password
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("12345");
		Thread.sleep(1000);

		// First Name
		driver.findElement(By.xpath("/html/body/form[1]/input[1]")).sendKeys("Shristi");
		Thread.sleep(1000);
		
		/*
		 * // Last Name
		 * driver.findElement(By.xpath("/html/body/form[1]/input[1]")).sendKeys(
		 * "Shristi"); Thread.sleep(1000);
		 */

		// Submit button (First Form)
		driver.findElement(By.xpath("/html/body/form[1]/input[3]")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// Checkboxes
		driver.findElement(By.xpath("/html/body/form[2]/input[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/form[2]/input[3]")).click();
		Thread.sleep(1000);

		// Submit button (Second Form)
		driver.findElement(By.xpath("/html/body/form[2]/input[4]")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// Radio Buttons
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/input[5]")).click();
		Thread.sleep(1000);

		// Relocate Checkbox
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		Thread.sleep(1000);

		// Click Link
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// Dropdown
		Select s = new Select(driver.findElement(By.xpath("/html/body/select")));
		s.selectByVisibleText("Hindu");
		Thread.sleep(1000);

		// Sign Up Button
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		Thread.sleep(1000);

		driver.quit();
	}
}
