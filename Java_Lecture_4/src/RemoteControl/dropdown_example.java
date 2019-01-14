package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class dropdown_example {

	public static void main(String[] args) throws Exception {
		SeleniumServer server = new SeleniumServer();
		server.start();
		
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.geodatasource.com");
		selenium.start();
		selenium.setSpeed("2000");
		selenium.open("/world-major-cities.html");
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.select("//*[@id='countryCode']", "India");
		
		String values[] = selenium.getSelectOptions("//*[@id='countryCode']");
		for (String value : values)
		{
			System.out.println(value);
		}
		
		System.out.println("*****************");
		System.out.println(selenium.getTitle());		
		System.out.println(selenium.getText("//*[@id='mail']/form/p[1]/label"));
		System.out.println(selenium.isElementPresent("//*[@id='countryCode']"));
		
		selenium.close();
		selenium.stop();
		server.stop();
	}

}
