package ListenersISuite;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChildClass2 {
	
	@BeforeSuite
	public void bsuite()
	{
	   System.out.println("BeforeSuite method of child class 2 started");	
	}
	
	
	@Test
	public void test()
	{
		System.out.println("Test Method of child class 2 started");
	}
	
	@AfterSuite
	public void asuite()
	{
	   System.out.println("AfterSuite method of child class 2 started");	
	}

}