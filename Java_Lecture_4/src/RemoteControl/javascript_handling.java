package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class javascript_handling {

	public static void main(String[] args) throws Exception {
		SeleniumServer server = new SeleniumServer();
		server.start();
		
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.rediff.com");
		selenium.start();
		selenium.setSpeed("2000");
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		selenium.click("link=Sing in");
		selenium.click("id=btn_login");
		if (selenium.isAlertPresent())
		{
			System.out.println(selenium.getAlert());
			selenium.chooseOkOnNextConfirmation();
		}
		
		selenium.close();
		selenium.stop();
		server.stop();
	}

}
