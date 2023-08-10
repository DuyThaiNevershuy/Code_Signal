public class IsCaseInsensitivePalindrome {
    boolean solution(String inputString) {
        String str = inputString.toLowerCase(); //Chuyển hết chuỗi sang thành 1 loại ký tự không hoa
        int len = str.length();
        if(str.length() % 2 != 0) //Xét nếu số kí tự chuỗi là số lẻ
        {
            for(int i=0; i<(str.length()/2);i++) // so sanh 2 ky tự đối xứng ở 2 đầu String
            {
                if(str.charAt(i)!= str.charAt(str.length()-i-1)) //2 kí tự đối xứng khác nhau thì trả về false
                    return false;
            }
            return true;
        }
        else
        {
            //Tạo ra 2 String mới, str1 để chứa nửa đầu các kí tự của str, str2 chứa nửa sau của str
            String str1 = "";
            String str2 = "";
            str1 = str.substring(0, len/2);
            str2 = str.substring(len/2);
            StringBuffer str2Buffer = new StringBuffer(str2); //Chuyển str2 sang StringBuffer
            String newStr2 = str2Buffer.reverse().toString(); //Đảo ngược các kí tự ở str2 và chuyển lại về String
            // if(str1Bf.equals(str2Bf.reverse())) return true;
            if(str1.equalsIgnoreCase(newStr2)) return true; //So sánh str1 với str2 sau khi đã reverse
        }
        return false;
    }
    
}
