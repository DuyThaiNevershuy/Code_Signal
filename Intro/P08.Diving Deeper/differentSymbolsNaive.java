import java.util.HashSet;
import java.util.Set;

public class differentSymbolsNaive {
    int solution(String s) {
        //chuyển 1 string sang 1 mảng để tách biệt các kí tự trong 1 String
        char[] str = s.toCharArray();
        //tao 1 hashSet
        Set<Character> uniquSet = new HashSet<>();
        //Tao 1  hashset uniSet, và HashSet chỉ chứa các phần tử duy nhất
        for(int i=0; i<str.length;i++){
            uniquSet.add(str[i]);
        }
        
        return uniquSet.size();
        //Trả về giá trị là số kí tự xuất hiện riêng duy nhất
    }
            
}
