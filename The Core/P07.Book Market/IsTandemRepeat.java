public class IsTandemRepeat {
    boolean solution(String inputString) {
        if(inputString.length() % 2 != 0) return false; // Nếu string có lẻ kí tự--> trả về false luôn
        else //Chỉ xét khi chuỗi có chẵn kí tự
        {
            if(inputString.substring(0, inputString.length()/2).equals(inputString.substring(inputString.length()/2))) 
            //Tạo 2 tập con substring nửa đầu và nửa cuối của String, so sánh xem 2 substring con có bằng nhau không thì trả về true nếu giống
            return true;
            else return false;
        }
    }
    
}
