package TestNGStudy.testNGConcepts;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotaions {
	 // Write your code here
	  @AfterSuite
	  public void afterSuite(){
	    System.out.println("After Suite has been executed as no.9");
	  }
	  @BeforeClass
	  public void beforeClass(){
	    System.out.println("Before Class has been executed as no.3");
	  }
	  @BeforeTest
	  public void beforeTest(){
	    System.out.println("Before Test has been executed as no.2");
	  }
	  @BeforeMethod
	  public void beforeMethod(){
	    System.out.println("Before Method has been executed as no.4");
	  }
	  @Test()
	  public void GetpageTitle(){
	    System.out.println("Test has been executed as no.5");
	  }
	  
	  @BeforeGroups("IT")
	    public void beforeGroups(){
	    	System.out.println("Before groups executed");
	    }
	  @AfterGroups("IT")
	    public void afterGroups(){
	    	System.out.println("After groups executed");
	    }
	   @Test(groups= {"IT"})
	  public void GetpageTitle2(){
	    System.out.println("Test has been executed as no.55");
	  }
	   @Test(groups= {"IT"})
		  public void GetpageTitle3(){
		    System.out.println("Test has been executed as no.555");
	   }
	  @AfterMethod
	  public void afterMethod(){
	    System.out.println("After Method has been executed as no.6");
	  }

	  @AfterTest
	  public void afterTest(){
	    System.out.println("After Test has been executed as no.8");
	  }

	  @BeforeSuite
	  public void beforeSuite(){
	    System.out.println("Before Suite has been executed as no.1");
	  }


	@AfterClass
	  public void afterClass(){
	    System.out.println("After Class has been executed as no.7");
	  }
	/*Before Suite has been executed as no.1
	Before Test has been executed as no.2
	Before Class has been executed as no.3
	Before Method has been executed as no.4
	Test has been executed as no.5
	After Method has been executed as no.6
	Before groups executed
	Before Method has been executed as no.4
	Test has been executed as no.55
	After Method has been executed as no.6
	Before Method has been executed as no.4
	Test has been executed as no.555
	After Method has been executed as no.6
	After groups executed
	After Class has been executed as no.7
	After Test has been executed as no.8
	After Suite has been executed as no.9 */
	
}
