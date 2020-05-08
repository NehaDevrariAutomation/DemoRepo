package TESTNG.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;

	@BeforeMethod
	public void HomePage() {
		System.out.println("My Introduction Is-");
		System.out.println("My Name Is  Neha Devrari");
		System.out.println("I am a quality Analyst");
		
	}
	
	@Test
	public void Title() {
    int i= 90; int c = 80; int d=i+c;
    
    System.out.println("Title is==" +d);
    
	}
	
	@Test
	public void SearchBar() {
		
		System.out.println("Hello");      
		
				
	}
	
	@Test
	public void Mailbox() {
	boolean b=	driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isEnabled();
	Assert.assertEquals("mail", "gmail");

}
}
