import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/adity/Documents/drivers/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
				
		firefoxDriver.get("https://rahulshettyacademy.com");

		System.out.println(firefoxDriver.getTitle());

		System.out.println(firefoxDriver.getCurrentUrl());

		firefoxDriver.close();

	}

}
