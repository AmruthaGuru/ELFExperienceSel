package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends Base_Page
{
	public BooksPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement computingAndInternetAddToCartButton;
	
	public void clickcomputingAndInternetAddToCartButton()
	{
		computingAndInternetAddToCartButton.click();
	}
	
	@FindBy(partialLinkText = "Shopping")
	private WebElement shoppingCartLinkAfterAddingProductToCart;
	
	public void clickShoppingCartLink()
	{
		shoppingCartLinkAfterAddingProductToCart.click();
	}
}
