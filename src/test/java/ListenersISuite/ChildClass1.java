package ListenersISuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChildClass1 {
	
	@BeforeSuite
	public void bsuite()
	{
	   System.out.println("BeforeSuite method child class 1 started");	
	}
	
	
	@Test
	public void test()
	{
		System.out.println("Test child class 1  started");
	}
	
	@AfterSuite
	public void asuite()
	{
	   System.out.println("AfterSuite method child class 1  started");	
	}

}