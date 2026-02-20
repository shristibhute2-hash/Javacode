//WAP to click on few links using linktext and partial link text on "file:///C:/Users/MKT/Desktop/learningHTML1.html"
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkTextLocator_118 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/suraj/Desktop/Growtechminds/learningHTML1.html");

		driver.manage().window().maximize();
		Thread.sleep(1000);
	

		WebElement e2 = driver.findElement(By.name("name1"));
		if (e2.isSelected()) {
			System.out.println("Since its already selected,so not clicking on it");
		} else {
			System.out.println("Since its not selected,so  clicking on it");
			e2.click();
		}
		Thread.sleep(4000);

		WebElement e1 = driver.findElement(By.partialLinkText("know"));
		e1.click();

	}

}
