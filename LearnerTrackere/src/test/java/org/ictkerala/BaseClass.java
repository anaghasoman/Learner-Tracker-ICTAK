package org.ictkerala;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
	    driver.get("https://learnertracker.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


}
