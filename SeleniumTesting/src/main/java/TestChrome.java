import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.getTitle();
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("mail@mail.mail");
		
		WebElement buttom = driver.findElement(By.xpath("//a[@class='hero_home__link__desktop']"));
		buttom.click();

	}

}
