import java.util.regex.Pattern;

public class sumUpNumbers {
    int solution(String inputString) {
        String pattern = "\\d+";
        int sum = 0;
        Pattern regex = Pattern.compile(pattern); //Biểu mẫu chính quy lọc ra các kí tự là các chữ số
        Matcher matcher = regex.matcher(inputString); //Tìm các match ở trong inputString
        
        while (matcher.find()) // swr dụng phương thức để tìm kiếm các hết biểu mẫu là các số
        {
            String number = matcher.group();
            sum += Integer.parseInt(number);
        }
        return sum;
    }
    
}
