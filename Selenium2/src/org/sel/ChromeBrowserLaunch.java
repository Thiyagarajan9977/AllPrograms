package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {

		// Browser Launch

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// URL Launch

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
