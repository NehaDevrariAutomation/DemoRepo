package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alepopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("")).click();
		// Validation
		Alert alert=  driver.switchTo().alert();
		String text= alert.getText();
		
		if (text.equals("get the input")) {
			System.out.println("that is correct");
			
		}
		else {
			System.out.println("that is incorrect");
			
		}
		alert.accept();
		alert.dismiss();
			

	}

}
