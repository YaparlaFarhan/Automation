import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingDynamicDropDown {
	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://www.spicejet.com/");

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();

		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		Thread.sleep(6000);
		driver.close();

	}
}
