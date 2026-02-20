//Wap to type something on amazon search and press enter button
package batch61;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchPressEnter_125 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchbox.sendKeys("shoes", Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();
	}

}
