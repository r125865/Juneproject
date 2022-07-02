package org.Botcabexecutive;

import java.time.Duration;
import java.util.List;

import org.Bobcatlocator.LoadersLocator;
import org.Botcatpageexe.LoadersPageExecutive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecutivePage extends LoadersPageExecutive {
	public static void main(String[] args) {
		browser();
		geturl();
		alertButton();
		locator();
		compact();
		T450model();
		Arrow();
		//botcatt450track();
		// List product = driver.findElements(By.xpath("//div[contains(text(),'Compact
		// Track Loader')]/parent::*"));

		/*
		 * WebDriverWait details = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * List<WebElement> findElements1 = driver.findElements(By.
		 * xpath("//div[contains(text(),'Compact Track Loader')]/parent::*"));
		 * details.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//i[@class='fa fa-angle-right fa-3 btn'][1]"))).click(); for
		 * (WebElement webElement : findElements1) {
		 * System.out.println(webElement.getText());
		 * 
		 * }
		 */

		/*
		 * driver.findElement(By.xpath("//span[contains(text(),'Skid-Steer Loaders')]"))
		 * .click(); WebDriverWait details1 = new WebDriverWait(driver,
		 * Duration.ofSeconds(120)); List<WebElement> findElements2 =
		 * driver.findElements(By.
		 * xpath("//div[contains(text(),'Skid-Steer Loader')]/parent::*"));
		 * details1.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//i[@class='fa fa-angle-right fa-3 btn'])[2]"))).click();
		 * //details1.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//i[@class='fa fa-angle-right fa-3 btn'])[2]"))).click(); for
		 * (WebElement product : findElements2) { System.out.println(product.getText());
		 */

	}
}

//}
