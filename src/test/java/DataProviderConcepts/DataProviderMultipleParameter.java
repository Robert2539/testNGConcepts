package DataProviderConcepts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMultipleParameter {
	@DataProvider (name = "sumData")
	public Object[][] sumMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
	}
	
	@DataProvider (name = "mulData")
	public Object[][] mulMethod(){
		return new Object[][] {{2, 3 , 6}, {5, 7, 35}};
	}
	
	
      @Test (dataProvider = "sumData")
      public void myTest1(int a, int b, int result) {
	     int sum = a + b;
	     Assert.assertEquals(result, sum);
      }
      
      @Test (dataProvider = "mulData")
      public void myTest2(int a, int b, int result) {
	     int mul = a * b;
	     Assert.assertEquals(result, mul);
	     
      }
}