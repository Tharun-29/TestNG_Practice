package test;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;




public class firstPractice {
	
	@AfterTest
	public void lastMethod() {
		System.out.println("I will be executed last");
	}
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I will be No 1 while starting/executing Framework");
	}
	
	@BeforeMethod
	public void bfmethod() {
		System.out.println("I will be executed before each Test Case i.e(Before each @Test method)");
	}
	@AfterMethod
	public void afmethod() {
		System.out.println("I will be executed After each Test Case i.e(After each @Test method)");
	}
	
	@AfterSuite
	public void afsuite() {
		System.out.println("I will be last during execution of Framework");
	}
    
	public void firstMethod() {
		System.out.println("This is my First TestNG Practice");
		Reporter.log("Log results are ?",true);
	}
	
    @org.testng.annotations.Parameters({ "URL" })
	@Test
	public void secondMethod(String urlname) {
		System.out.println("This is my Second method");
		System.out.println(urlname);
	}
	
	@BeforeTest
	public void prerequisites() {
		System.out.println("I will be executed first");
	}
}
