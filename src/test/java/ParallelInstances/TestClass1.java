package ParallelInstances;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test
    public void testMethod1() {
        System.out.println("Executing TestClass1 - TestMethod1: " + Thread.currentThread().getId());
        // Your Selenium code here
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing TestClass1 - TestMethod2: " + Thread.currentThread().getId());
        // Your Selenium code here
    }
    
    @Test
    public void testMethod3() {
        System.out.println("Executing TestClass1 - TestMethod3: " + Thread.currentThread().getId());
        // Your Selenium code here
    }
    
}
