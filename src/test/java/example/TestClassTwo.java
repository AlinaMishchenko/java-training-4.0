package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters({"param1", "param2"})
    public void parameterFromXML(String param1, String param2) {
        System.out.println("Parameter from XML - Param1: " + param1 + ", Param2: " + param2);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void parameterFromDataProvider(String param1, int param2) {
        System.out.println("Parameter from DataProvider - Param1: " + param1 + ", Param2: " + param2);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Test1", 1},
                {"Test2", 2}
        };
    }
}
