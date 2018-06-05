package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPATHDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/shasan/Documents/Shadia's Workspace/Selenium/geckodriver" );
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
	}

}