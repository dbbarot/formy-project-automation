package practice.browser.examples2.practice.browser.example2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	public static void formSubmission(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("Deep");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Software Engineer Intern");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("option[value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("10/10/2021");
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

	}
}
