package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;

	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		System.out.println("Step 1: User is on login page");
		WebDriverManager.chromedriver().setup();// WebDriverManager will automatically launch the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step 2: User enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step 3: User is clicking on login button");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step 4: User lands on home page");
		driver.close();
	}

}



