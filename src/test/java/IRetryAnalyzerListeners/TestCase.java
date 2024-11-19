package IRetryAnalyzerListeners;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase {
	   @Test
	   public void firstMethod() {
	      Assert.assertTrue(true);
	      System.out.println("ji");
	      
	   }
		  
	   @Test
	   public void secondMethod() {
	      Assert.assertTrue(false);
	   
	   }
	}