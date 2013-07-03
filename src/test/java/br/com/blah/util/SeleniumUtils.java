package br.com.blah.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils {
	public static void wait(int seconds) {
		int milliSeconds = seconds * 1000;
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void dragAndDrop(WebDriver driver, WebElement element, WebElement target) {
		(new Actions(driver)).dragAndDrop(element, target).perform();
	}

	public static void clickElement(WebDriver driver, By selector) {
		WebElement elem = driver.findElement(selector);
		elem.click();
	}

	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
}
