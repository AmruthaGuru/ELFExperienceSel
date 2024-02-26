package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base_Page
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	public void enterEmail(String email)
	{
		emailTextField.sendKeys(email);
	}
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	public void enterPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
