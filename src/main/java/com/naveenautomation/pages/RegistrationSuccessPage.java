package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naveenautomation.proxydriver.ProxyDriver;

public class RegistrationSuccessPage extends Page {
	private static final String PAGE_URL = "/opencart/index.php?route=account/success";

	public RegistrationSuccessPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);

	}

	private static By registerAccountSuccessText = By.cssSelector("#content > h1");
	private static By continueBtn = By.cssSelector("input[value='Continue']");

	public String getRegisterAccountSuccessText() {
		return ((ProxyDriver) wd).getText(registerAccountSuccessText);
	}

	public RegisterAccountPage clickContinueBtn() {
		((ProxyDriver) wd).click(continueBtn);
		return new RegisterAccountPage(wd, true);
	}

	@Override
	protected void isLoaded() {
		if (!urlContains(wd.getCurrentUrl())) {
			throw new Error();
		}
	}

	@Override
	protected String getPageURL() {
		return getDomain() + PAGE_URL;
	}
}
