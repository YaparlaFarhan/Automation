import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckingElementIsEnabledOrDisabled {
	public static void main(String[] args) {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://www.spicejet.com/");
		String styleAttributeValue = driver.findElement(By.xpath(
				"//div[@data-testid='return-date-dropdown-label-test-id']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"))
				.getAttribute("style");
		boolean flag = false;
		if (styleAttributeValue.contains("opacity: 0")) {
			flag = true;
			System.out.println("True");
		} else {
			flag = false;
			System.out.println("False");
		}
		Assert.assertEquals(flag, false);
		// Selecting Round Trip
		driver.findElement(
				By.xpath("//div[@data-testid='round-trip-radio-button']//div[@class='css-1dbjc4n r-zso239']")).click();
		if (styleAttributeValue.contains("opacity: 1")) {
			flag = true;
			System.out.println("true_T");
		} else {
			flag = false;
			System.out.println("False_F");
		}
		Assert.assertEquals(flag, false);

		driver.close();
	}
}
