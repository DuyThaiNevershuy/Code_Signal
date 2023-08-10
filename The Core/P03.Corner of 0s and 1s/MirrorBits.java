public class MirrorBits {
    int solution(int a) {
        int temp;
        String str= "";
        //Chuyển dec sang binary
        while(a>0)
        {
            int remainder = a % 2; // Lấy phần dư
            str = remainder + str; // Thêm phần dư vào đầu chuỗi
            a /= 2; // Chia cho 2
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString(); // Đảo ngược lại chuỗi bit sau khi đã chuyển từ số a
        //Bat đầu chuyển chuỗi bit ngược có dc sang thập phân
        int decimal = 0;
        int power = 0;
        for (int i = sb.length() -1 ; i >= 0; i--) //chạy duyệt chuỗi từ phải sang trái
            { 
                char bit = sb.charAt(i);
                // Nếu bit là '1', ta cộng 2^power vào số thập phân
                if (bit == '1') {
                    decimal += Math.pow(2, power);
                }
                
                power++;
            }
            return decimal;
    }
    
}
