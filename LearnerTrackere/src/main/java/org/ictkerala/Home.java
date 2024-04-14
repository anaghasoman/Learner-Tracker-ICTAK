package org.ictkerala;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

   public class Home {
   WebDriver driver;
   @FindBy(xpath="//p[text()='ICTAK - Learner Tracker'")
   private WebElement hom_text;
   @FindBy(xpath="//button[text()='Login']")
   private By login_text;
   @FindBy(xpath="//img[@class='App-logo mb-2']")
   private By logo;
   public Home(WebDriver driver)
   {
	this.driver = driver;
	
 }
   public String Logintext_validation()
  {
	return driver.findElement(login_text).getText();
 }
  public boolean getLogo()
 {
	return driver.findElement(logo).isDisplayed();
 }
public String getTextHome() {
	// TODO Auto-generated method stub
	return null;
}
 }
    
	
	
	
	
	