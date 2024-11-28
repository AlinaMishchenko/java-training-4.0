package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testLowPriority() {
        System.out.println("Test with Priority 3");
    }

    @Test(priority = 2)
    public void testMediumPriority() {
        System.out.println("Test with Priority 2");
    }

    @Test(priority = 1)
    public void testHighPriority() {
        System.out.println("Test with Priority 1");
    }
}
