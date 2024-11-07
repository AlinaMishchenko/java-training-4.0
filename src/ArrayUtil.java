import java.util.HashSet;
import java.util.Set;

public class ArrayUtil {

    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> commonSet = new HashSet<>();
        Set<String> elementsSet = new HashSet<>();

        for (String element : array1) {
            elementsSet.add(element);
        }

        for (String element : array2) {
            if (elementsSet.contains(element)) {
                commonSet.add(element);
            }
        }

        return commonSet.toArray(new String[0]);
    }
}