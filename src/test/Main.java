package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
	//	System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","./test/lib/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
	
	// Navigate to URL
	driver.get("https://www.google.co.in");
	// Maximize the window.
	driver.manage().window().maximize();
	}

}
