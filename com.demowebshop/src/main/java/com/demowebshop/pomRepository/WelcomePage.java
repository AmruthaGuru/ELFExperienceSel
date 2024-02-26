package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends Base_Page
{
	public WelcomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	
	public void clickRegisterLink()
	{
		registerLink.click();
	}
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	public void clickLoginLink()
	{
		loginLink.click();
	}
	
	@FindBy(partialLinkText = "Shopping")
	private WebElement shoppingCartLink;
	
	public void clickShoppingcartLink()
	{
		shoppingCartLink.click();
	}
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	public void clickWishlistLink()
	{
		wishlistLink.click();
	}
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	public void clickHeaderBooksLink()
	{
		booksLink.click();
	}
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	public void clickComputersLink()
	{
		computersLink.click();
	}
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	public void clickElectronicsLink()
	{
		electronicsLink.click();
	}
	
	@FindBy(partialLinkText = "APPAREL ")
	private WebElement apparelAndShoesLink;
	
	public void clickApparelAndShoesLink()
	{
		apparelAndShoesLink.click();
	}
	
	@FindBy(partialLinkText = "DIGITAL")
	private WebElement digitalDownloadsLink;
	
	public void clickDigitalDownloadsLink()
	{
		apparelAndShoesLink.click();
	}
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	public void clickJewelryLink()
	{
		jewelryLink.click();
	}
	
	@FindBy(partialLinkText = "GIFT")
	private WebElement giftCardLink;
	
	public void clickGiftCardLink()
	{
		giftCardLink.click();
	}
}
