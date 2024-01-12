package MainPackage;

import java.time.Duration;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Constants.ConstantClass;
import PageObjects.LoginPage;

public class MainClass extends BaseClass {
	
	@Test
	public static void LogIntoThePage() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(ConstantClass.URL);
		
		driver.manage().window().maximize();
		
		LoginPage.getInstance().getUsername().sendKeys(ConstantClass.username);
		LoginPage.getInstance().getPassword().sendKeys(ConstantClass.password);
		LoginPage.getInstance().getLogin().click();
		
		Thread.sleep(Duration.ofSeconds(2));
		

	}

}
