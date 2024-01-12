package LoadingProperites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import Constants.ConstantClass;
import PageObjects.LoginPage;

public class LoadingClass {
	
	public static void loadingPropertyFile() throws Exception {
		
		FileInputStream fl = new FileInputStream("C:\\Users\\navve\\eclipse-workspace\\Wizard\\Property.properties");
		
		Properties  p = new Properties();
		
		p.load(fl);
		
		ConstantClass.username = p.getProperty("username");
		ConstantClass.password = p.getProperty("password");
		ConstantClass.URL = p.getProperty("URL");
		ConstantClass.brower = p.getProperty("browser");
		
		}
	
	public static  void BrowserLaunching(String st) {
		
		switch (st) {
		case "chrome":
			
			BaseClass.driver = new ChromeDriver();
			break;

		default:
			break;
		}
		

	}
	
	public static void PageFct() {
		PageFactory.initElements(BaseClass.driver, LoginPage.getInstance());

	}

}
