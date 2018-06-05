package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/shasan/Documents/Selenium training/geckodriver" );
		driver=new FirefoxDriver();
		String baseUrl="http://www.google.ca";
		driver.get(baseUrl);
	}

}
