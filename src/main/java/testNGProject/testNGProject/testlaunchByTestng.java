package testNGProject.testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testlaunchByTestng {

	
	@BeforeTest
	public void before1()
	{
		
		System.out.println("Test started :.....");
		
	}
	@Test
	public void testlaunch() 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\NIATestAutomation\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.aqmtechnologies.com");
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("mail open");
		driver.manage().window().maximize();
		driver.quit();
		Reporter.log("exceution done");
		Reporter.log("Excution Success");
	}
	
}
