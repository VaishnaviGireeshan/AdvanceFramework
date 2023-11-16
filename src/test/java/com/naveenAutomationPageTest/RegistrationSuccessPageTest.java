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

//	@Test
//
//	public void validateUserNavigatedToRegisterAccount() {
//		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
//				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);
//		registerAccountPage.enterFirstName("Johny");
//		registerAccountPage.enterLastName("Doe");
//		registerAccountPage.enterEmail("john.doey@example.com");
//		registerAccountPage.enterTelephone("1234567890");
//		registerAccountPage.enterPassword("john.doe");
//		registerAccountPage.enterConfirmPassword("john.doe");
//		registerAccountPage.checkPrivacyPolicyCheckBox();
//		registrationSuccessPage = registerAccountPage.clickSubmitBtn();
//		Assert.assertEquals(registerAccountPage.getRegisterAccountText(), "Register Account",
//				"User is not navigated to Register Account Page");
//	}
}
