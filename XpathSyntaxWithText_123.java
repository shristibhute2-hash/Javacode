package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSyntaxWithText_123 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(3000);

        // 1️⃣ Using exact text()
        driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        // 2️⃣ Using contains(text())
        driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        // 3️⃣ Using starts-with(text())
        driver.findElement(By.xpath("//a[starts-with(text(),'Challenging')]")).click();
        Thread.sleep(3000);

        driver.quit();

	}

}
