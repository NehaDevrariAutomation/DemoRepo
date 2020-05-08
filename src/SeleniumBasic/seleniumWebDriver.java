package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumWebDriver {

	public static void main(String[] args) {
		S 
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		// by Xpth
		driver.findElement(By.xpath("")).sendKeys("tom");
		driver.findElement(By.xpath("")).sendKeys("Jerry");
		
		// By Name
		
		driver.findElement(By.name("input")).sendKeys("tom");
		driver.findElement(By.name("")).sendKeys("jerry");
		
		// By ID
		
		driver.findElement(By.id("")).sendKeys("tom");
		driver.findElement(By.id("")).sendKeys("Jerry");
		
		// By Class
		driver.findElement(By.className("neha")).sendKeys("tom");
		driver.findElement(By.className("Devrari")).sendKeys("tom");
		
		// By CSS
		driver.findElement(By.cssSelector("")).sendKeys("tom");
		
		// By link
		driver.findElements(By.linkText("sign.in"));
		
		// By Partial Link Text
		
		driver.findElements(By.partialLinkText(""));
		
		// By select 
		
	   Select select= new Select(driver.findElement(By.name("neha")));
	   select.selectByVisibleText("October");
	   
	   
		}

}	