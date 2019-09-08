package practice.browser.examples2.practice.browser.example2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		
		FormPage formpage = new FormPage();
		formpage.formSubmission(driver);

		ConfirmPage confirmpage = new ConfirmPage();
		confirmpage.waitAlert(driver);

		confirmpage.assertEquals("The form was successfully submitted!",confirmpage.getAlerttext(driver));
	}
}
