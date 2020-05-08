package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FristSeleniumScript {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//home//shashwat//Desktop//newfolder//chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.selenium.dev/downloads/");
		String Title="Google";
		d.getTitle();
		//Validation (without validation testing is not complete)
		if(Title.equals("Google")) {
		System.out.println("COrrect Title");
		}
		else {
			System.out.println("Title is not matched");
		}
		d.getCurrentUrl();
		d.getPageSource();
		d.quit();

	}

}