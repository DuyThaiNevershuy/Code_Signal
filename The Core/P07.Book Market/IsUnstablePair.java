public class IsUnstablePair {
    boolean solution(String filename1, String filename2) {
        //Ham compareTo trả về số thứ chênh lệch chuỗi của từng kí tự theo bảng ascii
        int resultSensitive = filename1.compareTo(filename2); //Kieu tra 2 chuoi theo thứ tự từ điển dựa them mã Ascii
        String str = filename1.toLowerCase();
        String str2 = filename2.toLowerCase();
        int resultInsensitive = str.compareTo(str2);
        return (resultSensitive * resultInsensitive) < 0;
        //Nếu tích là một số âm, nghĩa là một kết quả lớn hơn 0 và kết quả kia nhỏ hơn 0, thì biểu thức trả về true, tức là có một tình huống không ổn định. Ngược lại, nếu tích không âm, tức là cả hai kết quả đều lớn hơn hoặc nhỏ hơn 0, thì biểu thức trả về false, tức là không có tình huống không ổn định.
    }
    
}
