import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingSpiceJetCalender {
	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://www.spicejet.com/");

		// Selecting Round Trip
		driver.findElement(
				By.xpath("//div[@data-testid='round-trip-radio-button']//div[@class='css-1dbjc4n r-zso239']")).click();

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();

		Thread.sleep(4000);

		driver.findElement(
				By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']//div[@class='css-1dbjc4n']"))
				.click();
		Thread.sleep(2000);
		
//		Need to work on it
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();

		Thread.sleep(9000);
		driver.close();

	}
}
