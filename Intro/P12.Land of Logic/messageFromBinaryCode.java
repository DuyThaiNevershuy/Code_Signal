public class messageFromBinaryCode {
    String solution(String code) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<code.length();i+=8) //Xét mỗi lần 8 bit
        {
            String str = new String();
            str = code.substring(i, Math.min(i+8, code.length())); //Tạo 1 chuỗi con để thêm 8 bit vào chuỗi
            // Nếu như xét lần cuối không đủ 8 bit thì lấy đủ số bit,
            //Ví dụ chuỗi code có 30 bit, thì 8 bit cuối từ i = 24 - 31, thì chỉ lấy 6 bít cuối (substring(24, Math.min(32, code.length=30))) --> substring(24,30) -> 8 bit cuối sẽ chỉ lấy 6 bit vào substring
            int decimal = Integer.parseInt(str,2); //Chuyển chuỗi nhị phân ra só thập phân
            char decToLetter = (char) decimal; //Chuyển số kí tự mã ASCII sang chữ cái 
            sb.append(decToLetter); //Add các kí tự vào chuỗi sb
        }
        return sb.toString();
    }
}
