public class CharacterParity {
    String solution(char symbol) {
        String str = "";
        if(!(symbol >= 48 && symbol <= 57)) //Nếu char không là kí tự số 
        {
            str = "not a digit";
        }
        else
        {
            int digit = Character.getNumericValue(symbol); // Lấy giá trị của char
            if(digit % 2 == 0) str = "even";
            else if(digit % 2 != 0) str = "odd";
        }
        return str;
        
        // String str = "";
        // int digit = Character.getNumericValue(symbol);
        // if(digit % 2 == 0) str = "even";
        // else if(digit % 2 != 0) str = "odd";
        // else str = " not a digit";
        // return str;
    }
    
}
