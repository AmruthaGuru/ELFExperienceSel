package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base_Page
{
	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	public void clickMaleRadioButton()
	{
		maleRadioButton.click();
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	public void clickFemaleRadioButton()
	{
		femaleRadioButton.click();
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	public void enterFirstName(String firstName)
	{
		firstNameTextField.sendKeys(firstName);
	}
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	public void enterLastName(String lastName)
	{
		lastNameTextField.sendKeys(lastName);
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
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	public void enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordTextField.sendKeys(confirmPassword);
	}
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public void clickRegisterButton()
	{
		registerButton.click();
	}
}
