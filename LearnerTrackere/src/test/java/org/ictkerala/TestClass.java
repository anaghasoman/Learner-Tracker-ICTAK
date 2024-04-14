package org.ictkerala;

import java.io.IOException;
import java.time.Duration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
		Home homeobj;
		Trainer trainerobj;
		AddForm formobj;
		Addlearner learnerobj;
		AdminLogin adminobj;
		
		@Test(priority=1)
		public void HomePage()
		
		{
			homeobj=new Home(driver);
			
			String text = homeobj.getTextHome();
			AssertJUnit.assertEquals(text,"ICTAK - Learner Tracker");
			System.out.println("Home page loaded successfully");
			String text1 = homeobj.getTextHome();
			AssertJUnit.assertEquals(text1, "Login");
			System.out.println("Home page loaded with Login");
			boolean logo = homeobj.getLogo();
			AssertJUnit.assertTrue(logo);
			System.out.println("Home page loaded with Logo");
			
		}
		
		@Test(priority=2)
		public void trainerlogin()
		{
			trainerobj = new Trainer(driver);
			
			trainerobj.TC_UP_01("Trainer", "trainer@123");
			AssertJUnit.assertTrue(trainerobj.allert_msg1());
			trainerobj.close_btn();
			
			trainerobj.TC_UP_04("trainer@123");
			AssertJUnit.assertTrue(trainerobj.user_req_msg());
			trainerobj.close_btn();
			
			trainerobj.TC_UP_003();
			AssertJUnit.assertTrue(trainerobj.usr_pswd_req_msg());
			trainerobj.close_btn();
			
			trainerobj.TC_TL_001("trainer", "trainer@123");
			AssertJUnit.assertTrue(trainerobj.TC_TLP_002()); 
			
		}
		
		@Test(priority=3)
		public void addform()
		{
			formobj = new AddForm(driver);
			
			formobj.TC_FORM_43();
			AssertJUnit.assertTrue(formobj.isFormAvailable());
			System.out.println("Learner's form is availble");
			
			AssertJUnit.assertTrue(formobj.isIdAvailable());
			AssertJUnit.assertTrue(formobj.isNameAvailable());
			AssertJUnit.assertTrue(formobj.isCourseAvailable());
			AssertJUnit.assertTrue(formobj.isProjectAvailable());
			AssertJUnit.assertTrue(formobj.isBatchAvailable());
			AssertJUnit.assertTrue(formobj.isCourseStatusAvailable());
			System.out.println("All fields are available in Learner's form");
			
			formobj.TC_FORM_44();
			AssertJUnit.assertTrue(formobj.isFSDAvailable());
			AssertJUnit.assertTrue(formobj.isDSAAvailable());
			AssertJUnit.assertTrue(formobj.isML_AIAvailable());
			AssertJUnit.assertTrue(formobj.isRPAAvailable());
			AssertJUnit.assertTrue(formobj.isSTAvailable());
			AssertJUnit.assertTrue(formobj.isCSAAvailable());
			System.out.println("All the options are available in Course dropdown");
			
			formobj.TC_FORM_45();
			AssertJUnit.assertTrue(formobj.isICTAKAvailable());
			AssertJUnit.assertTrue(formobj.isKKEMAvailable());
			AssertJUnit.assertTrue(formobj.isNORKAAvailable());
			AssertJUnit.assertTrue(formobj.isABCDAvailable());
			AssertJUnit.assertTrue(formobj.isKDISCAvailable());
			System.out.println("All the options are available in Project dropdown");
			
			formobj.TC_FORM_46();
			AssertJUnit.assertTrue(formobj.isMay_22Available());
			AssertJUnit.assertTrue(formobj.isJun_22Available());
			AssertJUnit.assertTrue(formobj.isJul_22Available());
			AssertJUnit.assertTrue(formobj.isAug_22Available());
			AssertJUnit.assertTrue(formobj.isDec_22Available());
			AssertJUnit.assertTrue(formobj.isMar_23Available());
			System.out.println("All the options are available in Batch dropdown");
			
			formobj.TC_FORM_47();
			AssertJUnit.assertTrue(formobj.isQualifiedAvailable());
			AssertJUnit.assertTrue(formobj.isIncompetentAvailable());
			System.out.println("All the options are available in Course Status dropdown");
			
			formobj.TC_FORM_48();
		}
		
		@Test(priority=4)
		public void addlearner() throws IOException, InterruptedException
		{
			learnerobj = new Addlearner(driver);
			
			learnerobj.TC_TLP_002();
			learnerobj.TC_TLP_003("", "");
			AssertJUnit.assertTrue(learnerobj.warning_msg());
			System.out.println("Posting failed without data");
			learnerobj.back_dashboard();
			
			learnerobj.TC_TLP_004("@123", "anu");
			AssertJUnit.assertTrue(learnerobj.warning_msg1());
			System.out.println("Posting failed with invalid Learner Id");
			
			learnerobj.TC_TLP_005("10", "12");
			AssertJUnit.assertTrue(learnerobj.warning_msg2());
			System.out.println("Posting failed with invalid Name");
			
			learnerobj.TC_TLP_006("66", "Padma");
			learnerobj.TC_TLP_007();
			AssertJUnit.assertTrue(learnerobj.Assertion_allert_msg());
			System.out.println("Learner posted successfully");
			learnerobj.ok_button();
			
			learnerobj.TC_BA_005("ST-01");
			learnerobj.TC_BA_006();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			learnerobj.TC_BA_001();
			AssertJUnit.assertTrue(learnerobj.isupload_available());
			System.out.println("Upload CSV file is available");

			learnerobj.TC_BA_002();
			AssertJUnit.assertTrue(learnerobj.Assertion_allert_msg2());
			System.out.println("File saved");
			
			learnerobj.TC_BA_003();
			learnerobj.TC_BA_004();
			learnerobj.TC_BA_007();
			AssertJUnit.assertTrue(learnerobj.Assertion_home());
			System.out.println("Navigated to home page");			
		}

@Test(priority=5)
public void admin()
{
	adminobj = new AdminLogin(driver);
	
	adminobj.TC_AL_001("admin","admin@123");
	AssertJUnit.assertTrue(adminobj.Alert_msg());
	System.out.println("Admin login failed");
} 
}
			

		
		


