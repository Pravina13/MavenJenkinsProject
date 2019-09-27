package testNGProject.testNGProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import junit.runner.TestRunListener;

public class TestSuiteMain {

	//testlaunchByTestng tkt= new testlaunchByTestng();
	
	public static void main(String[] args) throws Exception {
		
		TestListenerAdapter tla= new TestListenerAdapter();
		TestNG tkt= new TestNG();
		List<String> suites= Lists.newArrayList();
		suites.add("D:\\SampleTestngProject\\testNGProject\\testng.xml");
		tkt.setTestSuites(suites);
		tkt.run();
	
		
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\NIATestAutomation\\Grid\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://mail.aqmtechnologies.com");
//		
//		
//		Thread.sleep(2000);
//		System.out.println("mail open");
//		driver.manage().window().maximize();
//		driver.quit();
//		Reporter.log("exceution done");
		
		
		
		
	}
}
