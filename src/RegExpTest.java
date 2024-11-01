import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegExpTest {

    @DataProvider(name = "text")
    public static Object[][] text() {
        return new Object[][]{
                {"8.8.8.8", "8.8.8.8"},
                {"http://192.168.1.1/index.html", "192.168.1.1"},
                {"This text contains a valid IP address 254.254.254.254, find it!", "254.254.254.254"},
                {"IP could not have negative numbers like -1.-2.-3.-4", ""},
                {" Invalid IP: 300.300.300.300!", ""},
                {" Invalid IP: 256.256.256.256!", ""},
                {"invalid:256.256.256.256", ""},
                {"valid IP: 255.255.255.255!", "255.255.255.255"},
                {"invalid:255.255.255.255", "255.255.255.255"},
                {"Check this IP 172.16.0.1 in the middle of text", "172.16.0.1"},
                {"Multiple IPs: 10.0.0.1 and 192.168.0.100", "10.0.0.1"}
        };
    }

    @Test(dataProvider = "text")
    public void testSumArray(String text, String expectedResult) {
        String actualResult = RegExp.getIpAddress(text);

        assertEquals(actualResult, expectedResult, "IP address is not correct");
    }
}