package example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeGroups("group1")
    public void setupGroup1() {
        System.out.println("Setup for Group 1");
    }

    @AfterGroups("group1")
    public void teardownGroup1() {
        System.out.println("Teardown for Group 1");
    }

    @Test(groups = "group1")
    public void testGroup1Method1() {
        System.out.println("Test in Group 1 - Method 1");
    }

    @Test(groups = "group1")
    public void testGroup1Method2() {
        System.out.println("Test in Group 1 - Method 2");
    }

    @Test(groups = "group2")
    public void testGroup2Method1() {
        System.out.println("Test in Group 2 - Method 1");
    }

    @Test(groups = "group2", enabled = false) // Excluding this method from execution
    public void excludedTest() {
        System.out.println("This test is excluded from execution");
    }
}

