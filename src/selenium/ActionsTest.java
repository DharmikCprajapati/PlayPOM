package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions builder = new Actions(driver);
		
		WebElement motores= driver.findElement(By.linkText("Motors"));
		builder.moveToElement(motores).build().perform();
		
		List<WebElement> parts = driver.findElements(By.xpath("//nav[@aria-label='Parts & Accessories']//li"));
		Thread.sleep(3000);
		
		System.out.println(parts.size());
		
		for(WebElement i : parts) {
			System.out.println(i.getText());
		}
		
		driver.quit();
		
	}
}
