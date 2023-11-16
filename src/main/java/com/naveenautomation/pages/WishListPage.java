package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naveenautomation.proxydriver.ProxyDriver;

public class WishListPage extends Page{
	private static final String PAGE_URL = "/opencart/index.php?route=account/wishlist";
	public WishListPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
		
	}
	
	private static By wishListPageText = By.cssSelector("#content>h2");
	private static By wishListPageContinueBtn = By.xpath("//a[text()='Continue']");
	
	public String getWishListPageText() {
		return ((ProxyDriver) wd).getText(wishListPageText);

	}

	public AccountPage clickWishListPageContinueBtn() {
		((ProxyDriver) wd).click(wishListPageContinueBtn);
		return new AccountPage(wd, false);
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
