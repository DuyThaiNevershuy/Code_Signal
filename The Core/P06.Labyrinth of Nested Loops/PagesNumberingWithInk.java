public class PagesNumberingWithInk {
    int solution(int current, int numberOfDigits) {
    
        // int soChuSo  = String.valueOf(current).length();
        while(numberOfDigits > tinhSoChuSo(current)) //Neu  bnumberofDigit > so chu so
        {
            numberOfDigits-=tinhSoChuSo(current); // Mỗi lần in ra them 1 số thì trừ đi số mực còn lại để in (trừ đi numberOfDigit)
            if(numberOfDigits < tinhSoChuSo(current)) break; //nếu số mực còn lại để in < số chứ số đang xét, dừng
            current++; // Tăng current để xét số tiếp theo
        }
        return current;
    }
    int tinhSoChuSo(int number) // Hàm tính số chữ số của số current
    {
        int numberN = String.valueOf(number).length(); 
        return numberN;
    }
    
    
}
