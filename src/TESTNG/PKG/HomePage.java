package TESTNG.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void HomePage() {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.Google.com/");
	}
	
	@Test
	public void Title() {
	String Title=	driver.getTitle();
	System.out.println("Title is==" +Title);
    
	}
	
	@Test
	public void SearchBar() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello");
		Assert.assertEquals("Hello", "The test is fail");      
		
				
	}
	
	@Test
	public void Mailbox() {
	boolean b=	driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isEnabled();
	Assert.assertEquals("mail", "gmail");
		
	}
	@Test
	public void Logo() {
	boolean b=	driver.findElement(By.tagName("img")).isEnabled();
	Assert.assertEquals("IMG", "TEST IS FAIL");
	}
	
	@AfterClass
	public void Quit() {
		driver.quit();
	}
	
     }
	
	
	
	
	
	
	
	
	
	
	
