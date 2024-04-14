package org.ictkerala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddForm {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/tadd']")
	private WebElement Add_Learner_btn;
	@FindBy(xpath="//ion-icon[@name='cloud-upload']")
	private WebElement Bulk_Addition_btn;
	
	@FindBy(xpath="//div[@class='container w-50 mt-5 pt-5  bg-secondary-subtle rounded']/h3")
	private WebElement Assertion_Learners_form;
	
	@FindBy(xpath="//label[text()='Learner Id :']")
	private WebElement Assertion_Id;
	@FindBy(xpath="//label[text()='Name :']")
	private WebElement Assertion_Name;
	@FindBy(xpath="//label[text()='Course :']")
	private WebElement Assertion_Course;
	@FindBy(xpath="//label[text()='Project :']")
	private WebElement Assertion_Project;
	@FindBy(xpath="//label[text()='Batch :']")
	private WebElement Assertion_Batch;
	@FindBy(xpath="//label[text()='Course Status :']")
	private WebElement Assertion_CourseStatus;
	
	@FindBy(xpath="//select[@name='course']")
	private WebElement Select_Course;
	@FindBy(xpath="//option[text()='FSD']")
	private WebElement FSD;
	@FindBy(xpath="//option[text()='DSA']")
	private WebElement DSA;
	@FindBy(xpath="//option[text()='ML-AI']")
	private WebElement ML_AI;
	@FindBy(xpath="//option[text()='RPA']")
	private WebElement RPA;
	@FindBy(xpath="//option[text()='ST']")
	private WebElement ST;
	@FindBy(xpath="//option[text()='CSA']")
	private WebElement CSA;
	
	@FindBy(xpath="//select[@name='project']")
	private WebElement Select_Project;
	@FindBy(xpath="//option[text()='ICTAK']")
	private WebElement ICTAK;
	@FindBy(xpath="//option[text()='KKEM']")
	private WebElement KKEM;
	@FindBy(xpath="//option[text()='NORKA']")
	private WebElement NORKA;
	@FindBy(xpath="//option[text()='ABCD']")
	private WebElement ABCD;
	@FindBy(xpath="//option[text()='KDISC']")
	private WebElement KDISC;
	
	@FindBy(xpath="//select[@name='batch']")
	private WebElement Select_Batch;
	@FindBy(xpath="//option[text()='May_22']")
	private WebElement May_22;
	@FindBy(xpath="//option[text()='Jun_22']")
	private WebElement Jun_22;
	@FindBy(xpath="//option[text()='Jul_22']")
	private WebElement Jul_22;
	@FindBy(xpath="//option[text()='Aug_22']")
	private WebElement Aug_22;
	@FindBy(xpath="//option[text()='Dec_22']")
	private WebElement Dec_22;
	@FindBy(xpath="//option[text()='Mar_23']")
	private WebElement Mar_23;
	
	@FindBy(xpath="//select[@name='cstatus']")
	private WebElement Select_CStatus;
	@FindBy(xpath="//option[text()='Qualified']")
	private WebElement Qualified;
	@FindBy(xpath="//option[text()='Incompetent']")
	private WebElement Incompetent;
	
	@FindBy(xpath="//button[@class='btn btn-warning']")
	private WebElement Back_Dashboard;
	
	public AddForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void TC_FORM_43()
	{
		Add_Learner_btn.click();
	}
	public boolean isFormAvailable()
	{
		return Assertion_Learners_form.getText().toString().contains("Learner's form");
	}
	public boolean isIdAvailable()
	{
		return Assertion_Id.getText().toString().contains("Learner Id :");
	}
	public boolean isNameAvailable()
	{
		return Assertion_Name.getText().toString().contains("Name :");
	}
	public boolean isCourseAvailable()
	{
		return Assertion_Course.getText().toString().contains("Course :");
	}
	public boolean isProjectAvailable()
	{
		return Assertion_Project.getText().toString().contains("Project :");
	}
	public boolean isBatchAvailable()
	{
		return Assertion_Batch.getText().toString().contains("Batch :");
	}
	public boolean isCourseStatusAvailable()
	{
		return Assertion_CourseStatus.getText().toString().contains("Course Status :");
	}
	public void TC_FORM_44()
	{
		Select_Course.click();
		
	}
	public boolean isFSDAvailable()
	{
		return FSD.getText().toString().contains("FSD");
	}
	public boolean isDSAAvailable()
	{
		return DSA.getText().toString().contains("DSA");
	}
	public boolean isML_AIAvailable()
	{
		return ML_AI.getText().toString().contains("ML-AI");
	}
	public boolean isRPAAvailable()
	{
		return RPA.getText().toString().contains("RPA");
	}
	public boolean isSTAvailable()
	{
		return ST.getText().toString().contains("ST");
	}
	public boolean isCSAAvailable()
	{
		return CSA.getText().toString().contains("CSA");
	}
	public void TC_FORM_45()
	{
		Select_Project.click();
	}
	public boolean isICTAKAvailable()
	{
		return ICTAK.getText().toString().contains("ICTAK");
	}
	public boolean isKKEMAvailable()
	{
		return KKEM.getText().toString().contains("KKEM");
	}
	public boolean isNORKAAvailable()
	{
		return NORKA.getText().toString().contains("NORKA");
	}
	public boolean isABCDAvailable()
	{
		return ABCD.getText().toString().contains("ABCD");
	}
	public boolean isKDISCAvailable()
	{
		return KDISC.getText().toString().contains("KDISC");
	}
	public void TC_FORM_46()
	{
		Select_Batch.click();
	}
	public boolean isMay_22Available()
	{
		return May_22.getText().toString().contains("May_22");
	}
	public boolean isJun_22Available()
	{
		return Jun_22.getText().toString().contains("Jun_22");
	}
	public boolean isJul_22Available()
	{
		return Jul_22.getText().toString().contains("Jul_22");
	}
	public boolean isAug_22Available()
	{
		return Aug_22.getText().toString().contains("Aug_22");
	}
	public boolean isDec_22Available()
	{
		return Dec_22.getText().toString().contains("Dec_22");
	}
	public boolean isMar_23Available()
	{
		return Mar_23.getText().toString().contains("Mar_23");
	}
	public void TC_FORM_47()
	{
		Select_CStatus.click();
	}
	public boolean isQualifiedAvailable()
	{
		return Qualified.getText().toString().contains("Qualified");
	}
	public boolean isIncompetentAvailable()
	{
		return Incompetent.getText().toString().contains("Incompetent");
	}
	public void TC_FORM_48()
	{
		Back_Dashboard.click();
	}
}