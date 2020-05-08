package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserpop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
		// for check the upload browser.In send key we have to send direct path by our system.
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		
		driver.findElement(By.id("")).sendKeys("");
		driver.switchTo().frame("");
		
		
	}

}