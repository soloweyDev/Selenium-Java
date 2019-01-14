package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;
import org.testng.Assert;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RC1 {

	public static void main(String[] args) throws Exception {
		
		SeleniumServer server = new SeleniumServer();
		server.start();
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		System.out.println(selenium.getTitle());
		selenium.type("//*[@id='Email']", "raman@way2automation.com");
		selenium.type("//*[@id='Passwd']", "asdasdada");
		selenium.click("//*[@id='signIn']");
		selenium.waitForPageToLoad("50000");
		String actual = selenium.getText("//*[@id='errormsg_0_Passwd]");
		System.out.println();
		
		String expected = "Неверный пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", чтобы сбросить его.";
		/*
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
		Assert.assertEquals(actual, expected);
		
		selenium.captureScreenshot("C:\\screenshot\\selenium.jpg");
		
		selenium.close();
		selenium.stop();
		server.stop();
		// Assertions - JUnit & TestNG
		
	}

}
