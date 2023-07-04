public class firstDigit {
    char solution(String inputString) {
        char[] strChar = inputString.toCharArray();
        char digitChar = '0';
        for(int i=0; i<strChar.length;i++){
            if(strChar[i]>=48 && strChar[i]<=57){
                digitChar= strChar[i];
                //Chỉ cần tìm dc 1 số đầu tiên là break luôn
                break;
            }
        }
        return digitChar;
    }    
}
