public class longestDigitsPrefix {
    String solution(String inputString) {
        String str="";
        for(int i=0; i<inputString.length();i++){
            if(inputString.charAt(i) > 47 && inputString.charAt(i) < 58)
            {
                str+=inputString.charAt(i);
            }
            else break;
        }
        return str;
    }
    
}
