package Stepdif;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v139.page.Page;

import Main.Reuseble;
import Main.pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1  extends Reuseble{
	@Given("user login the page")
	public void user_login_the_page() {
		driver=new ChromeDriver();
		
		pages.url();
		driver.manage().window().maximize();
		
	}

	@When("user enter the username and password")
	public void user_enter_the_username() {
		pages.Detailes();
		
	}

	

	@Then("successfully login user")
	public void successfully_login_user() {
		System.out.println("Login was done");
	}



}