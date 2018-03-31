package co.pragra.moblileapp.admin;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAdmin {
	@AfterSuite
	public void teardown() {
	System.out.println("Mobile app uninstalled");
	}
	
	@BeforeTest
	public void loguser() {
		System.out.println("logged in as admin");
	}
	@AfterTest
	public void logoutuser() {
		System.out.println("logged Out as admin");
	}
	@Test
	public void tc1() {
		System.out.println("Passed first test case in admin");
}
	@Test
	public void tc2() {
		System.out.println("Passed Second test case in admin");
				
	}
}


