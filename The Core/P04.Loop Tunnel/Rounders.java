public class Rounders {
    int solution(int n) {
        // String numberStr = String.valueOf(n); // Chuyển số nguyên thành chuỗi
        // char firstDigit = numberStr.charAt(0); // Lấy ký tự đầu tiên
        // int updatedFirstDigit = Character.getNumericValue(firstDigit) + 1; //Tăng giá trị của chữ số đầu tiên lên 1 đơnvị
        // String updatedNumberStr = String.valueOf(updatedFirstDigit); // Khởi tạo chuỗi mới với ký tự đầu tiên
    
        // for (int i = 1; i < numberStr.length(); i++) {
        //     if
        //     updatedNumberStr += '0'; // Thêm chữ số '0' vào chuỗi mới
        // }
    
        // return Integer.parseInt(updatedNumberStr); // Chuyển đổi chuỗi thành số nguyên và trả về
        
        // String str = String.valueOf(n);
        // StringBuilder st = new StringBuilder(str);
        // char first = st.charAt(0);
        // if(n < 5) return 0;
        // for(int i=st.length()-1; i>0;i--)
        // {
        //     if(st.charAt(i) != '0' && st.charAt(i) < 5 ) 
        //     {
        //         st.setCharAt(i, '0');
        //     }
        //     else if(st.charAt(i) != '0' && st.charAt(i) < 5)
        //     {
        //         st.setCharAt(i, '0');
        //         st.setCharAt(i-1, st.charAt(i-1 )++);
        //     }
        // }
        // first++;
        // return Integer.parseInt(st.toString());
        
        int ten = 1;
        while (n > 10) {
            int dig = n % 10; //Gán chữ số cuối cùng của n cho biến dig
            n /= 10; //Chia cho 10 để bỏ hẳn chữ số cuối cùng đi
            if (dig >= 5){ //nếu chữ số < 5 thì không làm tròn gì và xử lý tiếp
                ++n;// nếu chữ số lớn hơn bằng 5 thì làm tròn lên và n tăng lên 1 đơn vị
            }
            ten *= 10; // tạo 1 số chỉ toàn 10^i;
        }
        return n * ten; // khi n < 10 thì nhân với ten để ra được số có n-1 chữ số 0
    }
    
}
