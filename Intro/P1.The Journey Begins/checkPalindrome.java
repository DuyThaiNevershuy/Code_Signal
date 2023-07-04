public class checkPalindrome {
    boolean solution(String inputString) {
        char s[] = inputString.toCharArray();
        int len = inputString.length();
       for(int i = 0; i<len/2; i++){
           if(s[i]!=s[len-i-1]){
               return false;
           }
       }
       return true;
    }    
}
