package RoughPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RoughPrac {
	
	public static RemoteWebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		
		driver.findElement(By.id("username")).sendKeys("Navveen17th");
		
		driver.findElement(By.id("password")).sendKeys("9680C0");
		
		driver.findElement(By.id("login")).click();
		
		

	}

}
