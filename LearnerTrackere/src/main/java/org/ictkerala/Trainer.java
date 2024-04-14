package org.ictkerala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trainer {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement login;
	@FindBy(xpath="//div//div[@class='container mx-auto p-xs-2 p-lg-5 w-xs-75 w-lg-25 border bg-light rounded col-sm-10 col-md-4 col-lg-4 col-xl-4 mt-5']")
	private WebElement Forgot_Password;
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement Dashboard;
	@FindBy(xpath="//div[text()='User not found !!']")
	private WebElement Allert_msg1;
	@FindBy(xpath="//button[@class='btn-close']")
	private WebElement Close_button;
	@FindBy(xpath="//small[text()='Username is required.']")
	private WebElement Username_req;
	@FindBy(xpath="//div[text()='Login Failed!!']")
	private WebElement Allert_msg2;
	@FindBy(xpath="//small[text()='Password is required.']")
	private WebElement Password_req;
	@FindBy(xpath="//small[text()='Please fill in all fields.']")
	private WebElement Usr_Pswd_req;
	@FindBy(xpath="//ion-icon[@name='person-add-outline']")
	private WebElement Add_Learner;
	@FindBy(xpath="//ion-icon[@name='cloud-upload']")
	private WebElement Bulk_Addition;
	
	public Trainer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void TC_UP_01(String username1, String password1)
	{
		Username.sendKeys(username1);
		Password.sendKeys(password1);
		login.click();
		System.out.println("Trainer login failed with invalid username");	
	}
	public boolean allert_msg1()
	{
		return Allert_msg1.getText().toString().contains("User not found !!");
		
	}
	
	public void close_btn()
	{
		Close_button.click();
	}
	public void TC_UP_04(String password2)
	{
		driver.navigate().refresh();
		Username.clear();
		Password.clear();
		Password.sendKeys(password2);
		login.click();
		System.out.println("Trainer login failed without username");	
	}
	public boolean user_req_msg()
	{
		return Username_req.getText().toString().contains("Username is required.");
	}
	
	public void TC_UP_003()
	{
		driver.navigate().refresh();
		Username.clear();
		
		Password.clear();
		
		login.click();
		System.out.println("Trainer login failed without Username and Password");	
	}
	public boolean usr_pswd_req_msg()
	{
		return Usr_Pswd_req.getText().toString().contains("Please fill in all fields.");
	}
	
	public void TC_TL_001(String username, String password)
	{
		Username.sendKeys(username);
		Password.sendKeys(password);
		login.click();
		System.out.println("Trainer login successful with valid username and password");
	}
	public boolean TC_TLP_002()
	{
		return Dashboard.getText().toString().contains("LearnerTracker");
		
	} 
	
	
	
}

