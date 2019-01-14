import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBrowser {
	
	public static String browser = "Firefox";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		switch(browser)
		{
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "InternetExplorer":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.get("http://google.com");
		
	}

}