import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDown {
	public static void main(String[] args) {
		WebDriver driver;
		BrowserLaunch.handlingCookies();
		driver = BrowserLaunch.broserLaunch("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement currencyDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select selectCurrencyDropDownValue = new Select(currencyDropDown);
		selectCurrencyDropDownValue.selectByIndex(3);
		System.out.println(selectCurrencyDropDownValue.getFirstSelectedOption().getText());
		selectCurrencyDropDownValue.selectByValue("INR");
		System.out.println(selectCurrencyDropDownValue.getFirstSelectedOption().getText());
		selectCurrencyDropDownValue.selectByVisibleText("AED");
		System.out.println(selectCurrencyDropDownValue.getFirstSelectedOption().getText());

		driver.close();
	}

}
