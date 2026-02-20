/* 	
-How to do right click
-How to do double click
- how to do hoverover
// -how to do drag and drop*/   //is done in another Program
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightlickDoubleClickHoverover_128A {

	public static void main(String[] args) throws InterruptedException {
	      ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.in");
	        Thread.sleep(4000);

	        Actions act = new Actions(driver);

	        // 1️ Hover Over (Accounts & Lists)
	        WebElement accountMenu = driver.findElement(By.id("nav-link-accountList"));
	        act.moveToElement(accountMenu).perform();
	        Thread.sleep(3000);

	        // 2️ Right Click on Amazon Logo
	        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	        act.contextClick(logo).perform();
	        Thread.sleep(3000);

	        // 3️ Double Click on Search Box
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        act.doubleClick(searchBox).perform();
	        Thread.sleep(3000);
	}

}
