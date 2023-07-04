public class alphabeticShift {
    String solution(String inputString) {
        char[] charString = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<charString.length;i++){
            if(charString[i]=='z') charString[i] = 'a';
            else{
                charString[i] = (char) (charString[i]+1);
            }
            sb.append(charString[i]);
        }
        return sb.toString();
    }    
}
