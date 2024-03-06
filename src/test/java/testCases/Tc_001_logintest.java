package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001_logintest extends BaseClass {
	@Test()
	public void login()
	{
		HomePage hp = new HomePage(driver);
		hp.setemail("Admin");
		hp.setpassword("admin123");
		hp.clicklogin();
	}

}
