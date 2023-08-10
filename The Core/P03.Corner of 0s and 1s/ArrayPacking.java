public class ArrayPacking {
    int solution(int[] a) {
        // int decimalNumber = 13; // Số thập phân cần chuyển đổi
            
        //     String binaryNumber = ""; // Chuỗi lưu số nhị phân
            
        //     while (decimalNumber > 0) {
        //         int remainder = decimalNumber % 2; // Lấy phần dư
        //         binaryNumber = remainder + binaryNumber; // Thêm phần dư vào đầu chuỗi
                
        //         decimalNumber = decimalNumber / 2; // Chia cho 2
                
        // String str = "";
        // String binStr = "";
        // for (int i =0; i<a.length;i++)
        // {
        //     while(a[i] > 0)
        //     {
        //         int soDu = a[i] % 2; //lay phần dư
        //         str= str + soDu;
        //         a[i]/=2;
        //     }
        //     binStr = binStr + str;
        // }    
        // int []binSt = new
        // int decimal = 0;
        // int power = 0;
        // for (int i = binStr.length() -1 ; i >= 0; i--) {
        //         char bit = binStr.charAt(i);
                
        //         // Nếu bit là '1', ta cộng 2^power vào số thập phân
        //         if (bit == '1') {
        //             decimal += Math.pow(2, i);
        //         }
                
        //         // power++;
        //     }
        //     return decimal;
        int result = a[0]; //chuỗi ban đầu là phần từ đầu tiên
        int dis = 8;
        for(int i = 1; i<a.length; i++){
            // result += a[i]<<dis;
            result= result +(a[i] << dis); //DIch dis vị trí của phânf tử a[i] sang bên trái
            dis=dis+8; // Tiếp tục tăng dis để dịch các a[i] tiếp theo sang trái 
        }
        return result;
    }        
}
