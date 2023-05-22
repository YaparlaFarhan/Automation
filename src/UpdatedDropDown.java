import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws Exception {
		BrowserLaunch.handlingCookies();
		WebDriver driver = BrowserLaunch.broserLaunch("https://rahulshettyacademy.com/dropdownsPractise/");

		String AdultsValueBefore = driver.findElement(By.id("divpaxinfo")).getText();
		driver.findElement(By.id("divpaxinfo")).click();

		int i = 1;
		while (i < 3) {

			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		String AdultsValueAfter = driver.findElement(By.id("divpaxinfo")).getText();

		System.out.println(AdultsValueBefore + " " + AdultsValueAfter);

		Assert.assertEquals(AdultsValueBefore, "1 Adult");
		Assert.assertEquals(AdultsValueAfter, "3 Adult");
		
		
		Thread.sleep(9000);
		driver.close();

	}
}
