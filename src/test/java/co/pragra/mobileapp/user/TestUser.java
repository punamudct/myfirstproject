package co.pragra.mobileapp.user;

import java.util.List;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestUser {

	@BeforeSuite
	public void setup() {
		System.out.println("moblileapp install");
	}
	@Parameters ({"username", "password"})
	@BeforeTest 
	public void loguser(String username, String password) {
		System.out.println("logged in as" + username + " and " + password);
	}
	@BeforeClass
	public void prepareTest() {
		int [][]myarray = {{1,2},{5,6}};  
		System.out.println("Sample post done");
		List <Integer[]> mylistarray = new ArrayList<Integer[]>();
		Integer []arr = {1, 2};
		mylistarray.add(arr);
}
	@Test (groups = {"regression", "Smoke"})
	public void TestComment() {
		System.out.println("Test Comment");
	
	}
	@Test (dataProvider = "mydataprovider", groups = {"Smoke"} ) 
	public void TestLike(String user, String password) {
		System.out.println("user = " + user);
		System.out.println("password = " + password);
	}
	@AfterTest
	public void logoutuser() {
		System.out.println("logged out as user");
}
	@DataProvider
	public Object[][] mydataprovider(){
		
		Object [][] myarray = {{"poonam", "abcd"}, {"smitha", "xyz"}
			
		};
		return myarray;
		
	}
}
