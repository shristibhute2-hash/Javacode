//WAP to launch flipkart and hoverover fashion and click on "mens t shirt"
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverOver_129 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement e1=        driver.findElement(By.xpath("//span[text()='Fashion']"));
        
        
        Actions a1=new Actions(driver);
        a1.moveToElement(e1).perform();
        
        WebElement e2=driver.findElement(By.linkText("Men's T-Shirts"));
        e2.click();

	}

}
