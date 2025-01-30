package IRetryAnalyzerListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IRetryAnalyzerClass implements IRetryAnalyzer, ITestListener  {

	int counter = 0;
	int retryLimit = 3;
	
	@Override
	public boolean retry(ITestResult result) {

		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}
}