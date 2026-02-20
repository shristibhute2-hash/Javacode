//WAP to print all the linktexts present in the given page of the website
package batch61;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinkTextofWebsite_115 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a")); // Find all links of website
		System.out.println("Total links Present " + links.size()); // Print count of links

		for (WebElement link : links) { // print all linkText
			String linkText = link.getText();
			if (!linkText.isEmpty()) { // To avoid blank links
				System.out.println(linkText);
				System.out.println(linkText);
			}

		}

	}
}
