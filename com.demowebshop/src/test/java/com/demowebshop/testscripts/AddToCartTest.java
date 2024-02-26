package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.BooksPage;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.ShoppingCartPage;
import com.demowebshop.pomRepository.WelcomePage;

public class AddToCartTest extends BaseTest
{
	@Test(dataProvider = "addToCart")
	
	public void TC_ShoppingCart_001(String email,String password)
	{
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickLoginLink();
		test.log(Status.INFO, "Login page is displayed");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		HomePage homePage=new HomePage(driver);
		try
		{
			softAssert.assertTrue(homePage.getLogoutLink().isDisplayed());
			if(homePage.getLogoutLink().isDisplayed())
			{
				test.log(Status.PASS, "User is successfully logged in");
				welcomePage.clickHeaderBooksLink();
				BooksPage booksPage=new BooksPage(driver);
				booksPage.clickcomputingAndInternetAddToCartButton();
				booksPage.clickShoppingCartLink();
				ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
				softAssert.assertTrue(shoppingCartPage.getShoppingCartFirstProductName().getText()
						.contains("Computing And Internet"));
				test.log(Status.PASS, "Product is added to cart");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.FAIL, "User is not logged in and product is not added to cart");
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshotofPage(driver)).build());
			Reporter.log("User not logged in");
		}
		homePage.clickLogoutLink();
	}
	
	@DataProvider(name="addToCart")
	public String[][] addToCartDataProvider() throws EncryptedDocumentException, IOException
	{
		return ExcelRead.multipleRead("AddToCart");
	}
}
