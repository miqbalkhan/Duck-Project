package StepDefinitations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import cucumber.deps.com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorter;

public class duckStepdefination {

	WebDriver driver;

	@Given("^user go to the google home page$")
	public void user_go_to_the_google_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\15164\\eclipse-workspace\\duck-project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

	}

	@When("^user verify the title of the page as \"([^\"]*)\"$")
	public void user_verify_the_title_of_the_page_as(String arg1) throws Throwable {

		String title = driver.getTitle();
		System.out.print(title);

		Assert.assertEquals(title, "Google");

	}

	@Then("^user type \"([^\"]*)\" in the serch box$")
	public void user_type_in_the_serch_box(String arg1) throws Throwable {

		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("ducks");
		search.sendKeys(Keys.ENTER);

	}

	@Then("^user verify that ducks were properly searched for$")
	public void user_verify_that_ducks_were_properly_searched_for() throws Throwable {

		String expected = "Duck";
		String actual = driver.findElement(By.xpath("//span[text()='Duck']")).getText();
		Assert.assertTrue(actual.contains(expected));

	}

	@Then("^user close the browser\\.$")
	public void user_close_the_browser() throws Throwable {

		driver.quit();
	}

}
