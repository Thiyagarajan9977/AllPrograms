package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowserLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//get a current page url
		
				String cu = driver.getCurrentUrl();
				System.out.println(cu);
				
				//get a page title
				
				String title = driver.getTitle();
				System.out.println(title);		
				
				//quit the browser
				driver.quit();			
		}

}
