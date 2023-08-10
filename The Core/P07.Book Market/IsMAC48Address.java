public class IsMAC48Address {
    boolean solution(String inputString) {
        int len = inputString.length();
         for (int i = 0; i<len; i++)
          {
          if(i % 3 == 2) // check thứ tự các dấu - là vị trí i chia 3 dư 2 
          {
              if(inputString.charAt(i)!='-')
              {
                  return false;
              }
          }
          else if(inputString.charAt(len -1)=='-') return false; //kiem tra ky tu cuoi xem co phai la dau - hay khong
          else if(inputString.charAt(i) < '0' || inputString.charAt(i) > '9'&& 
          inputString.charAt(i) < 'A' || inputString.charAt(i) > 'F' ) return false; //Kiểm tra các kí tự địa chỉ hợp lệ
          
         }
         return true;
      }
      
}
