package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoutomeXpah {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    //there are total 5 Method for dynamic Xpath.[IMPORTANT QUESTION FOR INTERVIEW]
	    // Method -------1!(by parameter)
	    driver.findElement(By.xpath("//input[@class='actbox']")).sendKeys("text");
	    
	    //Method -------------2!(By Contain method)
	    driver.findElement(By.xpath("//input[contain(@class='')]")).sendKeys("java");
	    
	    // Method ------------3! (By Start-With method)
	    driver.findElement(By.xpath("//input[start-with(@id,'test_')]")).sendKeys("test");
	    
	    // Method ------------4! (By ends-with  method)
	    
	    driver.findElement(By.xpath("//input[ends-with(@id,'test_')]")).sendKeys("test");
	    
	    // Method-------------5! (For link purpose only)
	    
	    driver.findElement(By.xpath("//a[contain(test().'this is the link test'])")).click();
	    
	    // Get the count all hyper link on page [IMPORTANT QUESTION FOR INTERVIEW]
	    
	   List <WebElement> linklist= driver.findElements(By.tagName("a"));
	   System.out.println(linklist.size());
	   
	   // Get the text of Each link on page [IMPORTANT QUESTION FOR INTERVIEW]
	   
	   List <WebElement> linkpage= driver.findElements(By.tagName("a"));
	   
	   for( int i=0;i<linkpage.size();i++) {
		   String linktest=linkpage.get(i).getText();
		   System.out.println(linktest);
		   
		   
	   }
	   
	   
	    
	    

	}

}
