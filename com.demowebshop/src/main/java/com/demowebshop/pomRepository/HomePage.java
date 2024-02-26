package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base_Page
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
	private WebElement loggedInEmailIDLink;
	
	public void clickEmailIDAccount()
	{
		loggedInEmailIDLink.click();
	}
	
	public WebElement getLoggedInEmailIDLink() 
	{
		return loggedInEmailIDLink;
	}

	public void setLoggedInEmailIDLink(WebElement loggedInEmailIDLink) 
	{
		this.loggedInEmailIDLink = loggedInEmailIDLink;
	}

	@FindBy(partialLinkText  = "Log out")
	private WebElement logoutLink;
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	
}
