import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingCheckBox {

	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://rahulshettyacademy.com/dropdownsPractise/");

		List<WebElement> element = driver.findElements(By.xpath("//div[@id='discount-checkbox']//label"));

		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().equalsIgnoreCase("Student")) {
				WebElement ele = driver.findElement(By.xpath("(//div[@id='discount-checkbox']//input)[" + i + "]"));
				System.out.println(ele.isSelected());
				ele.click();
				System.out.println(ele.isSelected());
			}
		}
		Thread.sleep(9000);

		driver.close();
	}
}
