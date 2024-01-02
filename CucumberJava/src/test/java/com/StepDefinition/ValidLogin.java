package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ValidLogin {
	
	WebDriver driver;
	
	@Given("Launch the url")
	public void launch_the_url() {
	 
		System.out.println("Test step to print line");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
	}

	@When("User enters valid login and password")
	public void user_enters_valid_login_and_password() {
		
		driver.findElement(By.partialLinkText("Sign In")).click();
		WebElement ele1=driver.findElement(By.xpath("//strong[text()=\"New Customers\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele1);
		
		driver.findElement(By.id("email")).sendKeys("pranjal.handik620@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@1234");
		
		
		
	   
	}

	/*
	 * @And("Click on Login button") public void click_on_login_button() {
	 * 
	 * driver.findElement(By.xpath("(//button[starts-with(@id,\"send2\")])[1]")).
	 * click();
	 * 
	 * }
	 */

	@Then("User should land on home page")
	public void user_should_land_on_home_page() {
	    driver.quit();
	}	

}
