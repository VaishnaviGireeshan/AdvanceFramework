package com.naveenAutomationPageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.base.TestBase;
import com.naveenautomation.pages.AccountPage;
import com.naveenautomation.pages.ConsumerSideNavigationBar;
import com.naveenautomation.pages.LoginPage;
import com.naveenautomation.pages.ReturnsPage;
import com.naveenautomation.pages.SideNavigationBar;
import com.naveenautomation.pages.WishListPage;

public class WishListPageTest extends TestBase {
	LoginPage loginPage;
	AccountPage accountPage;
	WishListPage wishListPage;

	@BeforeMethod
	public void launchBrowser() {
		initialise();
		loginPage = new LoginPage(wd, false).get();

	}

	@Test
	public void validateUserIsInWishListPage() {
		accountPage = (AccountPage) loginPage.submitLogin("SamStark@gmail.com", "Sam12345");
		wishListPage =(WishListPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.WISH_LIST);
		
	}
}
