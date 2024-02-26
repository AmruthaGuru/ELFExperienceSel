package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.RegisterPage;
import com.demowebshop.pomRepository.WelcomePage;

public class RegisterTest extends BaseTest
{
	@Test(dataProvider = "registerData")
	public void TC_Register_001(String gender,String firstname,String lastname,String email,String password,String confirmpassword)
	{
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickRegisterLink();
		RegisterPage registerPage=new RegisterPage(driver);
		if(gender.equalsIgnoreCase("M"))
		{
			registerPage.clickMaleRadioButton();
		}
		else if(gender.equalsIgnoreCase("F"))
		{
			registerPage.clickFemaleRadioButton();
		}
		else
		{
			Reporter.log("Gender is not valid",true);
		}
		registerPage.enterFirstName(firstname);
		registerPage.enterLastName(lastname);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(confirmpassword);
		registerPage.clickRegisterButton();
		HomePage homePage=new HomePage(driver);
		try 
		{
			softAssert.assertTrue(homePage.getLogoutLink().isDisplayed());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log("User not registered");
		}
	}
	
	@DataProvider(name="registerData")
	public String[][] registerDataProvider() throws EncryptedDocumentException, IOException
	{
		return ExcelRead.multipleRead("Register");
	}
}
