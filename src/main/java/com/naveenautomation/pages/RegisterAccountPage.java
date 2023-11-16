package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naveenautomation.proxydriver.ProxyDriver;

public class RegisterAccountPage extends Page {
	private static final String PAGE_URL = "/opencart/index.php?route=account/register";

	public RegisterAccountPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);

	}

	private static By inputFirstName = By.id("input-firstname");
	private static By inputLastName = By.id("input-lastname");
	private static By inputEmail = By.id("input-email");
	private static By inputTelephone = By.id("input-telephone");
	private static By inputPassword = By.id("input-password");
	private static By inputConfirmPassword = By.id("input-confirm");
	private static By privacyPolicyCheckBox = By.cssSelector("input[type='checkbox']");
	private static By continueBtn = By.cssSelector("input[value='Continue']");
	private static By registerAccountText = By.cssSelector("#content > h1");
	private static By warningText = By.cssSelector("div.text-danger");
	private static By alertText = By.cssSelector("div.alert-danger");
	private static By submitBtn = By.cssSelector("input[value='Continue']");

	public void enterFirstName(String firstName) {
		((ProxyDriver) wd).sendKeys(inputFirstName, firstName);
	}

	public void enterLastName(String lastName) {
		((ProxyDriver) wd).sendKeys(inputLastName, lastName);
	}

	public void enterEmail(String email) {
		((ProxyDriver) wd).sendKeys(inputEmail, email);

	}

	public void enterTelephone(String telephone) {
		((ProxyDriver) wd).sendKeys(inputTelephone, telephone);

	}

	public void enterPassword(String password) {
		((ProxyDriver) wd).sendKeys(inputPassword, password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		((ProxyDriver) wd).sendKeys(inputConfirmPassword, confirmPassword);
	}

	public void checkPrivacyPolicyCheckBox() {
		((ProxyDriver) wd).click(privacyPolicyCheckBox);

	}

	public RegisterAccountPage clickContinueBtn() {
		((ProxyDriver) wd).click(continueBtn);
		return new RegisterAccountPage(wd, true);
	}

	public RegistrationSuccessPage clickSubmitBtn() {
		((ProxyDriver) wd).click(submitBtn);
		return new RegistrationSuccessPage(wd, true);
	}

	public String getRegisterAccountText() {
		return ((ProxyDriver) wd).getText(registerAccountText);
	}

	public String getWarningText() {
		return ((ProxyDriver) wd).getText(warningText);
	}

	public String getAlertText() {
		return ((ProxyDriver) wd).getText(alertText);
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
