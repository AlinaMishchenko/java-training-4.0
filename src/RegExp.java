import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static String getIpAddress(String text) {
        String ipPattern = "\\b((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\b";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}