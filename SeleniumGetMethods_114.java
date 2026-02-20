  
/* 	
WAP using below 

1)getTitle()
2)getCurrentUrl()
3)driver.close()  
4)driver.quit() */ 
package batch61;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetMethods_114 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle(); //print the page title
		System.out.println("Title is  "+title);
		
		String url=driver.getCurrentUrl(); //print the current URL
		System.out.println("Current Url is  "+url);
		
		//driver.close();  //Close the current browser window
		driver.quit();  //Quit all browser windows and end the session

	}
}
