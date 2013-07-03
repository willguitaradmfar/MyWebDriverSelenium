package br.com.blah.testes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.blah.pages.GooglePage;
import br.com.blah.util.SeleniumUtils;

public class TestSearch {
	
	protected static WebDriver driver;
	private GooglePage googlePage;
	public static String BASEURL = "http://google.com.br";

	@Test
	public void test() {
		googlePage.gotoPage(BASEURL);
		SeleniumUtils.maximizeWindow(driver);
		googlePage.clickTextoBusca();
		googlePage.digitarTextoBusca("python");
		SeleniumUtils.wait(2);
		googlePage.clickBotaoBusca();
		SeleniumUtils.wait(2);
		// Exemplo com selector xpath
		assertEquals(
				"Python",
				driver.findElement(By
						.xpath("//html/body/div[5]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/ol/li/div/h3/a/em")).getText());
	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		googlePage = new GooglePage(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
