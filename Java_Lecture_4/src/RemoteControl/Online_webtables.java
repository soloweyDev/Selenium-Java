package RemoteControl;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Online_webtables {

	public static void main(String[] args) throws Exception {
		
		SeleniumServer server = new SeleniumServer();
		server.start();
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.scores.sify.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		// find row count
		int x= 2;
		int rownum = - 1;
		String row_start = "xpath = //html/body/div[1]/div[3]/table/tbody/tr[";
		String row_end = "]/td[2]";
		
		while (selenium.isElementPresent(row_start + x + row_end))
		{
			x++;
			rownum++;
		}
		System.out.println("row count : " + rownum);
		
		x = 1;
		int colnum = -1;
		String col_start = "xpath = //html/body/div[1]/div[3]/table/tbody/tr[2]/td[";
		String col_end = "]";
		
		while (selenium.isElementPresent(col_start + x + col_end))
		{
			x++;
			colnum++;
		}
		System.out.println("col count : " + colnum);
		
		// extract dynamic data from the webtable
		System.out.println("---------------------------------");
		
		String xp_start = "xpath = //html/body/div[1]/div[3]/table/tbody/tr[";
		String xp_mid = "]/td[";
		String xp_end = "]";
		
		for (int rows = 1; rows <= rownum; rows++)
		{
			for (int cols = 1; cols <= colnum; cols++)
			{
				//System.out.println(selenium.getText(xp_start + rows + xp_mid + cols + xp_end));
				System.out.println(selenium.getTable("xpath = //html/body/div[1]/div[3]/table[1]." + (rows -1) + "." + (cols -1)));
			}
			
			System.out.println(); // to print all the values in seperate line
		}
		
		selenium.close();
		selenium.stop();
		server.stop();
		
	}

}
