package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Captcha_exmple {

	public static void main(String[] args) throws Exception {
		
		SeleniumServer server = new SeleniumServer();
		server.start();
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "https://timesofindia.indiatimes.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		String textnew = selenium.getText("//*[@id='mathq2'");
		System.out.println(textnew);
		System.out.println(textnew.substring(0, 1));
		System.out.println(textnew.substring(4, 5));
		
		int num1 = Integer.parseInt(textnew.substring(0, 1));
		int num2 = Integer.parseInt(textnew.substring(4, 5));
		int calc = num1 + num2;
		System.out.println(calc);
		String final_value = String.valueOf(calc);
		selenium.type("//*[@id='mathuserans2'", final_value);
		
		selenium.close();
		selenium.stop();
		server.stop();

	}

}
