package BaseClass;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Constants.ConstantClass;
import LoadingProperites.LoadingClass;

public class BaseClass {
	
	public static RemoteWebDriver driver;
	
	@BeforeSuite
	
	public static void tearDN() throws Exception {
		LoadingClass.loadingPropertyFile();
		LoadingClass.BrowserLaunching(ConstantClass.brower);
		LoadingClass.PageFct();

	}
	
	@AfterSuite
	
	public void closing() {
		driver.close();

	}

}
