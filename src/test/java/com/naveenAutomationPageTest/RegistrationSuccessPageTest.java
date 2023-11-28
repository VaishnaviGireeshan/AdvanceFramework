package com.naveenAutomationPageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.base.TestBase;
import com.naveenautomation.pages.AccountPage;
import com.naveenautomation.pages.ConsumerSideNavigationBar;
import com.naveenautomation.pages.LoginPage;
import com.naveenautomation.pages.RegisterAccountPage;
import com.naveenautomation.pages.RegistrationSuccessPage;
import com.naveenautomation.pages.SideNavigationBar;

public class RegistrationSuccessPageTest  extends TestBase {
	LoginPage loginPage;
	AccountPage accountPage;
	RegisterAccountPage registerAccountPage;
	RegistrationSuccessPage registrationSuccessPage;

	@BeforeMethod
	public void launch() {
		initialise();
		loginPage = new LoginPage(wd, false).get();

	}


}
