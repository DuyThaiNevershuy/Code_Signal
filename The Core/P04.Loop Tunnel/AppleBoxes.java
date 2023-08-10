public class AppleBoxes {
    int solution(int k) {
        int red = 0;
        int yellow = 0;
        for (int i = 1; i<=k ; i++)
        {
            if(i%2 == 0) red+=i*i;  //tổng táo đỏ ở giỏ thứ k chẵn
            else yellow+=i*i; //tổng số táo vàng ở giỏ thứ k lẻ
        }
        return red - yellow;
    }
    
}
