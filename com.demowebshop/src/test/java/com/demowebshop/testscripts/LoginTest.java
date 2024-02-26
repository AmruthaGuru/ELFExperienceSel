package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.WelcomePage;

public class LoginTest extends BaseTest 
{
	@Test(dataProvider = "loginData")
	public void TC_Login_001(String email,String password) throws InterruptedException
	{	
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickLoginLink();
		Thread.sleep(2000);
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(2000);
		HomePage homePage=new HomePage(driver);
		try 
		{
			softAssert.assertTrue(homePage.getLogoutLink().isDisplayed());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log("User not logged in");
		}
		homePage.clickLogoutLink();
		Thread.sleep(2000);	
	}
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws EncryptedDocumentException, IOException
	{
		return ExcelRead.multipleRead("Login");
	}
}
