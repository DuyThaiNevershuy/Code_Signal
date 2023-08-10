public class IncreaseNumberRoundness {
    boolean solution(int n) {
        // char s[]= String.valueOf(n).toCharArray();
        // if (n % 10 != 0) return false;
        // if(s.length<2) return false; // 1 chữ số thì ko có độ tròn
        // for(char c : s) if (c != '0') return false; //Kiem tra xem nếu chuỗi không có số 0 nào --> trả về false 
        // for (int i = (s.length -1); i>=1 -1;i--) // kiem tra xem có số nào mà có 1 số giữa 2 số 0 hay ko
        // {
        //     if(s[i-1] == '0' && s[i] != '0' && s[i+1] == '0' ) return true;
        // }
        // return false;
        
        int temp = 0;
        //Trả về true nếu số n chứa số 0 sau các chữ số khác và ngược lại
        while(n!=0)
        {
            if(n%10!=0){
                temp = 1;
            }
            if(n%10 == 0){
                if(temp==1) return true;
            }
            n/=10;
        }
        
        return false;
        
        
    }
    
}
