import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSuggestiveDropDown {
	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://rahulshettyacademy.com/dropdownsPractise/");

		String country = "Ind";
		driver.findElement(By.id("autosuggest")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys(country);
		Thread.sleep(3000);
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;

			}

		}
		Thread.sleep(6000);

		driver.close();
	}
}
