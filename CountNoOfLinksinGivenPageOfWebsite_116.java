//WAP to print total number of links present in the given page of the website.
package batch61;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfLinksinGivenPageOfWebsite_116 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> e1 = driver.findElements(By.tagName("a"));

		int count = e1.size();
		System.out.println(count);

	}

}
