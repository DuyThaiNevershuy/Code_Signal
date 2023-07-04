public class ArithmeticExpression {
    boolean solution(int a, int b, int c) {
        if(a-b==c || a+b == c || a/(b*1.0)==c || a*b==c) return true; 
        //phải chia b ở kiểu thập phân vì VD a=8,b=3,c=2  nếu 8/3 thì thương lấy số nguyên == 2 kq trả về true --> ra sai
        else return false;
    }    
}
