package DataProviderConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderClass {
	@DataProvider(name = "testData")
	public Object[][] dpMethod() {
		return new Object[][] { { "First-Value" }, { "Second-Value" } };
	}

	@Test(dataProvider = "testData")
	public void myTestMethod(String val) {
		System.out.println("Passed Parameter Is : " + val);
	}
}
