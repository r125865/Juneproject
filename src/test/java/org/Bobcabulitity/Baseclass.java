package org.Bobcabulitity;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
public static WebDriver driver;
public static String booking;
public static void browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Arun Class\\eclipse\\FileHandling\\External\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 driver.manage().window().maximize();
}
public static void url (String url) {
	driver.get(url);
}
public static WebElement findEleByXpath(String xpath) {
	return driver.findElement(By.xpath(xpath));

}
public static void data(WebElement element, String data) {		
		element.sendKeys(data);		
}
public static void click(WebElement element) {
	element.click();
}
public static void waits (String path) {
	WebDriverWait details = new WebDriverWait(driver, Duration.ofSeconds(30));
	List<WebElement> findElements1 = driver.findElements(By.xpath(path));
	details.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
	for (WebElement webElement : findElements1) {
		System.out.println(webElement.getText());
		
	}
	
}




}
