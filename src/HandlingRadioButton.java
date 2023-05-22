import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HandlingRadioButton {
	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement ele = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		System.out.print(ele.isSelected());
		ele.click();
		System.out.print(ele.isSelected());

		Thread.sleep(9000);
		Assert.assertTrue(ele.isSelected());
		

		driver.close();

	}
}
