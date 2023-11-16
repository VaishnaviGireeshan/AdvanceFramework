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

public class RegisterAccountPageTest extends TestBase {
	LoginPage loginPage;
	AccountPage accountPage;
	RegisterAccountPage registerAccountPage;
	RegistrationSuccessPage registrationSuccessPage;

	@BeforeMethod
	public void launch() {
		initialise();
		loginPage = new LoginPage(wd, false).get();

	}

	@Test

	public void validateUserNavigatedToRegisterAccount() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);
		Assert.assertEquals(registerAccountPage.getRegisterAccountText(), "Register Account",
				"User is not navigated to Register Account Page");
	}

	@Test
	public void validateUserCanNotSkipFirstName() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterLastName("Sam");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "First Name must be between 1 and 32 characters!",
				"User successfully skipped First Name. Validation failed.");
	}

	@Test
	public void validateUserCanNotEnterInvalidFirstName() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);
		registerAccountPage.enterFirstName("Samnnnnneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "First Name must be between 1 and 32 characters!",
				"User successfully skipped First Name. Validation failed.");
	}

	@Test
	public void validateUserCanNotEnterInvalidLastName() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);
		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("DoeDoeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "Last Name must be between 1 and 32 characters!",
				"User successfully skipped First Name. Validation failed.");
	}

	@Test
	public void validateUserCanNotSkipLastName() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "Last Name must be between 1 and 32 characters!",
				"User successfully skipped Last Name. Validation failed.");

	}

	@Test
	public void validateUserCanNotSkipEmail() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "E-Mail Address does not appear to be valid!",
				"User successfully skipped Email. Validation failed.");
	}
//	@Test
//	public void validateUserCanNotEnterInvalidEmail() {
//		
//	}

	@Test
	public void validateUserCanNotEnterInvalidTelephone() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doe@example.com");

		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "Telephone must be between 3 and 32 characters!",
				"User successfully skipped Telephone. Validation failed.");
	}

	@Test
	public void validateUserCanNotSkipPassword() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "Password must be between 4 and 20 characters!",
				"User successfully skipped Password. Validation failed.");
	}

	@Test
	public void validateUserCanNotSkipConfirmPassword() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getWarningText(), "Password confirmation does not match password!",
				"User successfully skipped Confirm Password. Validation failed.");
	}

	@Test
	public void validateUserCheckEDPrivacyPolicyCheckBox() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sami");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doee@example.com");
		registerAccountPage.enterTelephone("1134567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.clickContinueBtn();
		Assert.assertEquals(registerAccountPage.getAlertText(), "Warning: You must agree to the Privacy Policy!",
				"User successfully skipped Privacy PolicyCheck Box. Validation failed.");
	}

	@Test
	public void validateUserIsAbleToRegisterWithValidInfo() {
		registerAccountPage = (RegisterAccountPage) new SideNavigationBar(wd, false)
				.OpenPageByClickOnSideNavBar(ConsumerSideNavigationBar.REGISTER);

		registerAccountPage.enterFirstName("Sam");
		registerAccountPage.enterLastName("Doe");
		registerAccountPage.enterEmail("Sam.doe@example.com");
		registerAccountPage.enterTelephone("1234567890");
		registerAccountPage.enterPassword("Sam.doe");
		registerAccountPage.enterConfirmPassword("Sam.doe");
		registerAccountPage.checkPrivacyPolicyCheckBox();

		 registrationSuccessPage = registerAccountPage.clickSubmitBtn();
		Assert.assertEquals(registrationSuccessPage.getRegisterAccountSuccessText(), "Your Account Has Been Created!",
				"User is not Able To Register With Valid Info");
	}
}
