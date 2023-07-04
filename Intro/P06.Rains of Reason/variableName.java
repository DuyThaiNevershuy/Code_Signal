public class variableName {
    boolean solution(String name) {
        char[] charName = name.toCharArray();
        if(charName[0] >= 48 && charName[0]<= 57){ // kiem tra xem ki tu dau tien co phai so hay ko
            return false;
        }
        else{
        for(int i=0;i<charName.length;i++){
            if(charName[i]==95 || (charName[i]>=48 && charName[i]<=57) || (charName[i]>=65 && charName[i]<=90)
            || (charName[i]>=97 && charName[i]<=122)) {
                //Sao lai trong?
            }
            else  return false;
        }
        return true;
        }
    }
    
}
