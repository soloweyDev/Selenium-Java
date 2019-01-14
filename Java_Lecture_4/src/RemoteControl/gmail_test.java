package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class gmail_test {
	
	public static void main(String[] args) throws Exception
	{
		SeleniumServer server = new SeleniumServer();
		server.start();
		
		//Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://gmail.com");
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.links.com");
		selenium.start();
		selenium.setSpeed("2000");
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();/*
		selenium.type("id=Email", "selenium");
		selenium.type("//*[@id='Passwd']", "abcd");
		//selenium.click("//input[@id='signIn']");
		selenium.clickAt("//input[@id='signIn']", "Sing in");
		selenium.check("//*[@id='PersistentCookie']");
		//selenium.uncheck("//*[@id='PersistentCookie']");
		*/
		String links[] = selenium.getAllLinks();
		for (int i = 0; i < links.length; i++)
		{
			System.out.println(links[i]);
		}
		
		selenium.close();
		selenium.stop();
		server.stop();
	}
}
