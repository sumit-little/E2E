package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base{

	@Test
	public void basePageNavigation() throws IOException
	
	{
	driver=initializeDriver();
	driver.get("http://qaclickacademy.com");
	driver.manage().window().maximize();
	LandingPage l = new LandingPage(driver);
	l.getLogin().click();
	
	}
}
