public class IntegerToStringOfFixedWidth {
    String solution(int number, int width) {
        char[] str = Integer.toString(number).toCharArray();
        String arr = "";
        if(str.length == width) return Integer.toString(number); 
        if(str.length > width)
        {
            for(int i=str.length - width;i < str.length;i++) //In từ vị trí len - width đến hết chuỗi 
            {
                arr += String.valueOf(str[i]); //Ép kiểu từ char sang String
            }
        }
        else if(str.length < width)
        {
            String zero = ""; //Tạo 1 String lưu trữ các số 0 
            for(int i=0; i< width - str.length; i++) //xem thiếu bao nhiêu số 0 thì thêm vào số chữ số 0 vào mảng zero
            {
                // arr = "0" + String.valueOf(str);
                zero += "0";
            }
            arr = zero + String.valueOf(str); // Thêm mảng toàn số 0 vào trước chuỗi số number 
        }
        return arr;
    }
    
    
}
