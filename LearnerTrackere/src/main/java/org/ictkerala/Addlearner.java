package org.ictkerala;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addlearner {
WebDriver driver;
	
	@FindBy(xpath="//a[@href='/tadd']")
	private WebElement Add_Learner_btn;
	@FindBy(xpath="//input[@id='learnerid']")
	private WebElement Learner_Id;
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;
	
	@FindBy(xpath="//select[@name='course']")
	private WebElement Course;
	@FindBy(xpath="//option[@value='ST']")
	private WebElement ST;
	@FindBy(xpath="//option[text()='FSD']")
	private WebElement FSD;
	@FindBy(xpath="//option[text()='DSA']")
	private WebElement DSA;
	
	@FindBy(xpath="//select[@name='project']")
	private WebElement Project;
	@FindBy(xpath="//option[@value='ICTAK']")
	private WebElement ICTAK;
	@FindBy(xpath="//option[text()='KKEM']")
	private WebElement KKEM;
	@FindBy(xpath="//option[text()='NORKA']")
	private WebElement NORKA;
	
	@FindBy(xpath="//select[@name='batch']")
	private WebElement Batch;
	@FindBy(xpath="//option[@value='Aug_22']")
	private WebElement Aug_22;
	@FindBy(xpath="//option[text()='Jul_22']")
	private WebElement Jul_22;
	@FindBy(xpath="//option[text()='Dec_22']")
	private WebElement Dec_22;
	
	@FindBy(xpath="//select[@name='cstatus']")
	private WebElement Course_Status;
	@FindBy(xpath="//option[@value='Qualified']")
	private WebElement Qualified;
	@FindBy(xpath="//option[text()='Incompetent']")
	private WebElement Incompetent;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Submit_button;
	@FindBy(xpath="//div[text()='Posted successfully']")
	private WebElement Allert_Message;
	@FindBy(xpath="//button[@type='button' and text()='OK']")
	private WebElement Ok_Button;
	
	@FindBy(xpath="//tbody/tr[2]//button[@type='button' and @class='btn btn-success']")
	private WebElement Edit_Button;
	@FindBy(xpath="//tbody/tr[2]//button[@class='btn btn-danger']")
	private WebElement Delete_Button;
	
	@FindBy(xpath="//p[text()='Must contain letters,numbers and - only']")
	private WebElement Warning_msg;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	private WebElement Back_Dashboard;
	@FindBy(xpath="//p[text()='Must contain letters only']")
	private WebElement Warning_msg2;
	
	@FindBy(xpath="//div/a[2]//button[@class='mb-3 btn btn-success']")
	private WebElement Bulk_Add_btn;
	@FindBy(xpath="//label[text()='Upload a CSV File :']")
	private WebElement Assertion_Upload;
	@FindBy(xpath="//input[@type='file' and @name='file']")
	private WebElement Choose_File;
	@FindBy(xpath="//button[@class='ui grey mini button' and text()='Submit']")
	private WebElement Submit_btn;
	@FindBy(xpath="//h2[text()='Data added successfully..!']")
	private WebElement Allert_Msg;
	@FindBy(xpath="//button[text()='Return to Dashboard']")
	private WebElement Return_To_Dashboard;
	@FindBy(xpath="//h2[text()='Saved!']")
	private WebElement Allert_Msg1;
	@FindBy(xpath="//button[text()='OK']")
	private WebElement Ok;
	
	@FindBy(xpath="//button[@class='ui mini button']")
	private WebElement Cancel_btn;
	@FindBy(xpath="//a[@id='basic-nav-dropdown']")
	private WebElement Trainer_dropdown;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	@FindBy(xpath="//p[text()='ICTAK - Learner Tracker']")
	private WebElement Home_page;
	
	public Addlearner(WebDriver driver)
			{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void TC_TLP_002()
		{
			Add_Learner_btn.click();
		}
		
		public void TC_TLP_003(String id2, String name2)
		{
			Learner_Id.sendKeys(id2);
			Name.sendKeys(name2);
			Course.click();
			Project.click();
			Batch.click();
			Course_Status.click();
			Submit_button.click();
		}
		public boolean warning_msg()
		{
			return Warning_msg.getText().toString().contains("Must contain letters,numbers and - only");
		}
		public void back_dashboard()
		{
			Back_Dashboard.click();
		}
		public void TC_TLP_004(String id3, String name3)
		{
			Add_Learner_btn.click();
			Learner_Id.sendKeys(id3);
			Name.sendKeys(name3);
			Course.click();
			FSD.click();
			Project.click();
			KKEM.click();
			Batch.click();
			Jul_22.click();
			Course_Status.click();
			Incompetent.click();
			Submit_button.click();
		}
		public boolean warning_msg1()
		{
			return Warning_msg.getText().toString().contains("Must contain letters,numbers and - only");
		}
		
		public void TC_TLP_005(String id4, String name4)
		{
			Back_Dashboard.click();
			Add_Learner_btn.click();
			Learner_Id.sendKeys(id4);
			Name.sendKeys(name4);
			Course.click();
			DSA.click();
			Project.click();
			NORKA.click();
			Batch.click();
			Dec_22.click();
			Course_Status.click();
			Incompetent.click();
			Submit_button.click();
		}
		public boolean warning_msg2()
		{
			return Warning_msg2.getText().toString().contains("Must contain letters only");
		}
		
		
		public void TC_TLP_006(String id, String name)
		{
			Back_Dashboard.click();
			Add_Learner_btn.click();
			Learner_Id.sendKeys(id);
			Name.sendKeys(name);
			Course.click();
			ST.click();
			Project.click();
			ICTAK.click();
			Batch.click();
			Aug_22.click();
			Course_Status.click();
			Qualified.click();
		}
		public void TC_TLP_007()
		{
			Submit_button.click();
		}
		public boolean Assertion_allert_msg()
		{
			return Allert_Message.getText().toString().contains("Posted successfully");
		}
		public void ok_button()
		{
			Ok_Button.click();
		}
		public void TC_BA_005(String id1)
		{
			Edit_Button.click();
			Learner_Id.sendKeys(id1);
			Submit_button.click();
			System.out.println("Updation Successful");
		}
		public void TC_BA_006()
		{
			Delete_Button.click();
			System.out.println("Deletion Successful");
		}
		public void TC_BA_001()
		{
			Bulk_Add_btn.click();
		}
		public boolean isupload_available()
		{
			return Assertion_Upload.getText().toString().contains("Upload a CSV File :");
		}
	
		public void TC_BA_002()
		{
			Return_To_Dashboard.click();
			Ok.click();
		}
		public boolean Assertion_allert_msg2()
		{
			return Allert_Msg1.getText().toString().contains("Saved!");
			
		}
		public void TC_BA_003()
		{
			Bulk_Add_btn.click();
			//Choose_File.sendKeys(file1);
			Submit_btn.click();
			driver.switchTo().alert().accept();	
		}
		public void TC_BA_004()
		{
			Cancel_btn.click();
		}
		public void TC_BA_007()
		{
			Trainer_dropdown.click();
			Logout.click();
		}
		public boolean Assertion_home()
		{
			return Home_page.getText().toString().contains("ICTAK - Learner Tracker");
			
		}
	}
				