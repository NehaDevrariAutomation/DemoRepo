package SeleniumBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Objectrepositry {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	Properties pro= new Properties();
	FileInputStream ip= new FileInputStream("/home/shashwat/eclipse-workspace/testproject/src/day1/text.properties");
	 
	pro.load(ip);
	System.out.println(pro.getProperty("Name"));
	System.out.println(pro.getProperty("LastName"));
	System.out.println(pro.getProperty("fristName_xpath"));
	System.out.println(pro.getProperty("FristName"));
    
	String BrowserName= pro.getProperty("browser");
	String url= pro.getProperty("url");
	
	System.out.println(pro.getProperty("url"));
	System.out.println(pro.getProperty("browser"));
	
	
	if (BrowserName.equals("chrome") ) {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
		 //for check the upload browser.In send key we have to send direct path by our system.
		WebDriver driver= new ChromeDriver();
		
	}
	
    driver.get(url);
    driver.findElement(By.xpath(pro.getProperty("fristName_xpath"))).sendKeys(pro.getProperty("FristName"));
    driver.findElement(By.xpath(pro.getProperty("secondName_xpath"))).sendKeys(pro.getProperty("secondName"));
    driver.findElement(By.xpath(pro.getProperty("TirdName_xpath"))).sendKeys(pro.getProperty("ThirdName"));
    driver.findElement(By.xpath(pro.getProperty("button"))).click();
    
    
    
    
	}

}
