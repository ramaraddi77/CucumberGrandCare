package POMobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Testscripts;

public class pomclass extends Testscripts
{
	@FindBy(xpath = "//a[contains(text(),' in')]")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement email_field;
	
	@FindBy(id = "Password")
	private WebElement Password_field;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//div[@class='header-menu']/ul/li[3]/a")
	private WebElement electronics_majTab;
	
	@FindBy(xpath = "//div[@class='header-menu']/following-sibling::div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/h2/a")
	private WebElement cellphones_link;
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement positiondrop;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement Display_Drop;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement GridDrop;
	@FindBy(xpath = "//a[text()='Used phone']")
	private WebElement usedphonelink;
	
	public pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement LoginLink()
	{
		return login_link;
	}
	public WebElement emailTextField()
	{
		return email_field;
	}
	public WebElement passwordTextField()
	{
		return Password_field;
	}
	public WebElement LoginButton()
	{
		return login_btn;
	}
	public WebElement ElectronicMTab()
	{
		return electronics_majTab;
	}
	public WebElement cellPhonesLink()
	{
		return cellphones_link;
	}
	public WebElement PositionDRop()
	{
		return positiondrop;
	}
	public WebElement DispDrop()
	{
		return Display_Drop;
	}
	public WebElement GridDropdown()
	{
		return GridDrop;
	}
	public WebElement usedPhones()
	{
		return usedphonelink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
