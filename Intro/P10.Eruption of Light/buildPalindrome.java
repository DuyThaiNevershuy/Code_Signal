public class buildPalindrome {
    String solution(String st) {
        // String strRev = new StringBuffer(st).reverse().toString();
        // if(st.equals(strRev)) return st; //String st đã vốn là chuỗi palindrome
        // else
        // {
        //     for(int i = 0; i< st.length();i++)
        //     {
        //         if ((st.substring(0, i)+strRev).equals(new StringBuffer(st.substring(0,i)+strRev).reverse().toString())){
        //             return st.substring(0, i) + strRev;
        //         }
        //     }
        // }
        // return ""; //Khong co chuoi co the format ve palindrome
        
        
        int soKyTu = 1;
        String str = st;
        String strRev = new StringBuffer(st).reverse().toString();
        if(st.equals(strRev)) return st; //String st đã vốn là chuỗi palindrome
        else
        {
            while(0<1) //Vong while vo han
            {
                //Thêm các kí tự đầu tiên vào cuối chuỗi 1 cách đối xứng
                for(int i = soKyTu-1;i >=0; i--) //chay vòng for từ cuối chuỗi để thêm kí từ từ cuối chuỗi
                {
                    str= str+st.charAt(i);
                } 
                if(!checkStr(str)) //checkStr = false
                {
                    str = st;
                    soKyTu++;
                }
                else break;
            }
        return str;
        }
    }
    
    boolean checkStr(String s)
    {
        for(int i=0; i<(s.length()/2);i++) // so sanh 2 ky tự đối xứng ở 2 đầu String
        {
            if(s.charAt(i)!= s.charAt(s.length()-i-1))
            return false;
            
        }
        return true;
    }
    
}
