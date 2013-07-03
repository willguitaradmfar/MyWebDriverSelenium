package br.com.blah.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.blah.util.SeleniumUtils;

public abstract class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		initElements();
	}

	public void initElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotoPage(String baseURL) {
		this.driver.get(baseURL);
		SeleniumUtils.wait(2);
		this.initElements();
	}
	
	public abstract String getPageUrl();

}
