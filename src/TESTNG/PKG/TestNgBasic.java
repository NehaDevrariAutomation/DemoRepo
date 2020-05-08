package TESTNG.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgBasic {
	  WebDriver driver;
	
	@BeforeClass
		public void Lunc() {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		
	}
	
	@Test
    
	@AfterClass
	
public void setUP() {
		System.out.println("setup");
	}

}
