import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        int maxLength = 0;
        for (String str : inputArray) {
            maxLength = Math.max(maxLength, str.length());
        }
        
        List<String> longestStrings = new ArrayList<>();
        for (String str : inputArray) {
            if (str.length() == maxLength) {
                longestStrings.add(str);
            }
        }
        
        String[] resultArray = new String[longestStrings.size()];
        resultArray = longestStrings.toArray(resultArray);
        return resultArray;
    
    }    
}
