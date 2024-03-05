package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import POMobjects.pomclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscripts  implements FrameworkConstants
{
	public WebDriver driver;
	public pomclass pom;
	
	@Given("open the browser and enter the url")
	public void open_the_browser_and_enter_the_url()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed1() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Demo Web Shop");
	}

	@When("Enter the credentials")
	public void enter_the_credentials() throws InterruptedException 
	{
		pom = new pomclass(driver);
		Thread.sleep(2000);
		pom.LoginLink().click();
		Thread.sleep(2000);
		pom.emailTextField().sendKeys(email);
		Thread.sleep(2000);
		pom.passwordTextField().sendKeys(pass);
		Thread.sleep(2000);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException
	{
		Thread.sleep(2000);
		pom.LoginButton().click();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Demo Web shop");
	}

	@When("click on electronics link")
	public void click_on_electronics_link()
	{
		pom.ElectronicMTab().click();
	}

	@When("click on cellphones")
	public void click_on_cellphones()
	{
		pom.cellPhonesLink().click();
	}

	@When("select all the dropdowns")
	public void select_all_the_dropdowns() 
	{
		SelectGenericClass.selectbyindex(pom.PositionDRop(), 1);
		SelectGenericClass.selectbyindex(pom.DispDrop(), 2);
		SelectGenericClass.selectbyindex(pom.GridDropdown(), 1);
	}

	@When("click on used phone")
	public void click_on_used_phone()
	{
		pom.usedPhones().click();
	}

	@Then("check whether used phone is displayed")
	public void check_whether_used_phone_is_displayed() 
	{
		driver.quit();
	}
}
