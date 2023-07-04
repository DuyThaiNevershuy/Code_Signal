import java.util.regex.Pattern;

public class longestWord {
    String solution(String text) {
        //Bieu thuc chính quy
        Pattern pattern = Pattern.compile("[a-zA-Z]+"); // Loc ra các kí tự là chữ
        //
        Matcher matcher = pattern.matcher(text); // Match pattern ở trong text
    
        String str="";
        int max = Integer.MIN_VALUE;
        while (matcher.find())
        {
            String word = matcher.group(); //Lọc ra các từ trong 1 String
            if(word.length() > max)
            {
                max=word.length();
                str = word;
            }
        }
        return str;
    }
        
}
