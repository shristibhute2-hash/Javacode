package batch61;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkTextEccommerceApplication_119 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Mobile")).click();
		Thread.sleep(3000);
		driver.navigate().back(); // // go back to previous page in browser history

		driver.findElement(By.partialLinkText("Customer")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
