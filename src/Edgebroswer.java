import org.openqa.selenium.edge.EdgeDriver;

public class Edgebroswer {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver","/Users/adity/Documents/drivers/msedgedriver.exe");
	
		EdgeDriver edgeDriver = new EdgeDriver();
		
		edgeDriver.get("https://web.lio.io/");

		System.out.println(edgeDriver.getTitle());

		System.out.println(edgeDriver.getCurrentUrl());

//		driver.close();
	}

}
