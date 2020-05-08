package SeleniumBasic;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class HandlePopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("www.popup.com");
	    
	    driver.findElement(By.xpath("xhuh")).click();
	    Thread.sleep(2000);
	    
	     Set<String> hand = driver.getWindowHandles();
	    Iterator<String> it= hand.iterator();

	    String parentwindow= it.next();
	    System.out.println("this is parentwidow Id-"+parentwindow);
	    
	    String childwindow= it.next();
	    System.out.println("this is childwindow Id-"+childwindow);
	    
	    
	    driver.switchTo().window(childwindow);
	    Thread.sleep(2000);
	    driver.close();
	    
	  
	    driver.switchTo().window(parentwindow);
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	    
	    
	}

}
