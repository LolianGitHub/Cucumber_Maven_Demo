package cucumber.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class StepDefinitionDemo 
{

	WebDriver driver;
	Scenario scenario;
	
	
	@Before()
	public void testSetUp(Scenario scenario)
	{
		this.scenario = scenario;
//	    ChromeDriverManager.chromedriver().setup();
//	    ChromeOptions chromeOptions = new ChromeOptions();
//	    chromeOptions.addArguments("--headless");
//	    driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();
		System.out.println("Setup");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown(Scenario scenario)
	{
		scenario.write("Finishied scenario");
		if (scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
			System.out.println("Test Environment Destoryed");
			System.out.println("------------");
			driver.close();
			driver.quit();
		
	}
	
	@Given ("^I've a valid set of data and access$")
	public void ValidUserCheck() throws Throwable
	{
		//System.out.println("Valid User");
		//driver = new ChromeDriver();
		System.out.println("Test Environment Set up Tagname : ShoppingWriteReview");
	}
	
	@When ("^Home page Display$")
	public void registrationDisplay() throws Throwable 
	{
		driver.navigate().to("https://www.accordo.com/");
		driver.manage().window().maximize();

	}
	
	@Then("^Go to Our Stories Page$")
	public void EnterShoppingPage() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-2938']//a")));
		
		WebElement StoryPage = driver.findElement(By.xpath("//li[@id='menu-item-2938']//a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", StoryPage);
		StoryPage.click();
	}
	
	@Then("^Click Case Studies$")
	public void SelectBrandsCategory() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ultimate-layouts-filter-item ul-filter-action ulicon-casestudies']")));
		
		WebElement Case = driver.findElement(By.xpath("//div[@class='ultimate-layouts-filter-item ul-filter-action ulicon-casestudies']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", Case);
		Case.click();
	}
	
	@Then("^Go to Contact Us Page$")
	public void SelectActeonCategory() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-2562']//div[@class='menu-title']")));
		
		WebElement ContactUs = driver.findElement(By.xpath("//li[@id='menu-item-2562']//div[@class='menu-title']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('target', '_self');", ContactUs);
		ContactUs.click();
	}
	
	
	@Then ("^Enter Valid Data$")
	public void enterValidData(DataTable userdetails) throws Throwable
	{
		List<List<String>> data = userdetails.raw();
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i).toString());
		}
		
		driver.findElement(By.xpath("//input[@id='input_8_1']")).sendKeys(data.get(0).get(1).toString());
		driver.findElement(By.xpath("//input[@id='input_8_2']")).sendKeys(data.get(1).get(1).toString());
		driver.findElement(By.xpath("//input[@id='input_8_3']")).sendKeys(data.get(2).get(1).toString());
		driver.findElement(By.xpath("//input[@id='input_8_4']")).sendKeys(data.get(3).get(1).toString());
		driver.findElement(By.xpath("//textarea[@id='input_8_5']")).sendKeys(data.get(4).get(1).toString());

	}
	
	@Then ("^Click Send$")
	public void click_Submit() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='gform_submit_button_8']")).click();
	}
	

	@And("^Close$")
	public void close() throws Throwable
	{
		System.out.println("quick browser");
	}
}
