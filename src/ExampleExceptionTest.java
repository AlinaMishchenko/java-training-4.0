import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleExceptionTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {3, 5, 15},
                {4, 4, 16}
        };
    }

    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {4, -4},
                {-4, 4}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int expected) {
        assertEquals(ExampleException.rectangleArea(a, b), expected, "Rectangle area calculation is incorrect");
    }


    @Test(dataProvider = "negativeData", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "input value is below zero!")
    public void testRectangleAreaNegative(int a, int b) {
        ExampleException.rectangleArea(a, b);
    }
}