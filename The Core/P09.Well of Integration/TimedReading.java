import java.util.regex.Pattern;

public class TimedReading {
    int solution(int maxLength, String text) {
        //Bieu thức chính quy
        Pattern pattern = Pattern.compile("[a-zA-Z]+"); // Loc ra các kí tự là chữ
        //
        Matcher matcher = pattern.matcher(text); // Match pattern ở trong text
        int count = 0;
        while(matcher.find())
        {
            String str = matcher.group(); // Lọc ra các từ trong string text gán vào str 
            if(str.length() <= maxLength) count++; // Kiểm tra độ dài của từng từ trong String text
        }
        return count;
    }
    
}
