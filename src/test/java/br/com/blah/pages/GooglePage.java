package br.com.blah.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.blah.service.AbstractPage;

public class GooglePage extends AbstractPage {

	@FindBy(css = "div input#gbqfq.gbqfif")
	private WebElement campoBusca;

	@FindBy(css = "button#gbqfb.gbqfb")
	private WebElement botaoBusca;
	
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void digitarTextoBusca(String texto) {
		this.campoBusca.sendKeys(texto);
	}

	public void clickBotaoBusca() {
		this.botaoBusca.click();
	}
	
	public void clickTextoBusca() {
		this.campoBusca.click();
	}

	@Override
	public String getPageUrl() {
		// TODO Auto-generated method stub
		return null;
	}

}
