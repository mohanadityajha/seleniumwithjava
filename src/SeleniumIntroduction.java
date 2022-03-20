import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
   //System.setProperty("webdriver.chrome.driver","/Users/adity/Documents/drivers/chromedriver.exe");
  //System.setProperty("webdriver.gecko.driver","/Users/adity/Documents/drivers/geckodriver.exe");
	System.setProperty("webdriver.edge.driver","/Users/adity/Documents/drivers/msedgedriver.exe");	
				
	//WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
	WebDriver driver = new EdgeDriver();
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  driver.get("https://facebook.com");
	  
	  driver.close();
	}
}
