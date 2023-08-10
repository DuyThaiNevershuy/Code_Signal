public class AlphabetSubsequence {
    boolean solution(String s) {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1) || s.charAt(i) > s.charAt(i+1)) return false;
            //Kiểm tra nếu kí tự đằng trước trùng kí tự sau hoặc kí tự đằng trước có mã ascii > kí tự đằng sau --> sai
        }
        return true;
    }
    
}
