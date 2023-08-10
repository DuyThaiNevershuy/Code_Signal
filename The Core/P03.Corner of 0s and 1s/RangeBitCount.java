public class RangeBitCount {
    int solution(int a, int b) {
        String str = "";
        String binStr= "";
        int count = 0;
        for (int i = a; i<=b; i++)
        {
            int temp = i;
            while(temp>0)
            {
                int remainder = temp % 2; // Lấy phần dư
                if(remainder % 2 == 1) count++;
                // str = remainder + str; // Thêm phần dư vào đầu chuỗi
                temp /= 2; // Chia cho 2
            }
            // binStr = binStr + str;
        
        }
       
        return count;
    }
    
}
