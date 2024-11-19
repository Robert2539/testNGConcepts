package ParallelInstances;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void testMethod1() {
		System.out.println("Executing TestClass2 - TestMethod1: " + Thread.currentThread().getId());
		// Your Selenium code here
	}

	@Test
	public void testMethod2() {
		System.out.println("Executing TestClass2 - TestMethod2: " + Thread.currentThread().getId());
		// Your Selenium code here
	}
	
	@Test
    public void testMethod3() {
        System.out.println("Executing TestClass2 - TestMethod3: " + Thread.currentThread().getId());
        // Your Selenium code here
    }
	
	
}
