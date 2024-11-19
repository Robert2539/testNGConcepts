package DataProviderConcepts;


import org.testng.Assert;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderSwitchConcepts {
	@DataProvider (name = "testData")
	public Object[][] dpMethod (Method m){
		switch (m.getName()) {
		case "Sum": 
			return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
		case "Diff": 
			return new Object[][] {{2, 3, -1}, {5, 7, -2}};
		}
		return null;
		
	}
	
	@Test (dataProvider = "testData")
	 public void Sum (int a, int b, int result) {
	      int sum = a + b;
	      Assert.assertEquals(result, sum);
	 }
	  
	@Test (dataProvider = "testData")
	public void Diff (int a, int b, int result) {
	      int diff = a - b;
	      Assert.assertEquals(result, diff);
	 }
}