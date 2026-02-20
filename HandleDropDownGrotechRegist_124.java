//	"How to handle dropdown	
//https://grotechminds.com/registration/"
package batch61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownGrotechRegist_124 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	// 1️ Select Country dropdown
    WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='Country']"));
    Select country = new Select(countryDropdown);
    country.selectByVisibleText("India");      // Select by visible text
    Thread.sleep(2000);

    // 2️ Select Skills dropdown
    WebElement skillsDropdown = driver.findElement(By.xpath("//select[@name='Skills']"));
    Select skills = new Select(skillsDropdown);
    skills.selectByIndex(2);          // Select by value attribute
    Thread.sleep(2000);

    // 3️⃣ Select Religion dropdown
    WebElement religionDropdown = driver.findElement(By.xpath("//select[@id='Relegion']"));
    Select religion = new Select(religionDropdown);
    religion.selectByIndex(2);                 // Select by index (0-based)
    Thread.sleep(2000);
    
	
	/*
	 * //4 Select selenuim dropdown WebElement SelenuimDropdown
	 * =driver.findElement(By.xpath("//select[@id='technicalskills']")); Select
	 * selenuim = new Select(SelenuimDropdown); selenuim.selectByIndex(2); // Select
	 * by index (0-based) Thread.sleep(2000);
	 */
	 
    
	}
}
