import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/adity/Documents/drivers/chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://web.lio.io/");

		System.out.println(chromeDriver.getTitle());

		System.out.println(chromeDriver.getCurrentUrl());

		chromeDriver.close();
	}

}
