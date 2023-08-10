public class CountSumofTwoRepresentations2 {
    int solution(int n, int l, int r) {
        // int count = 0;
        // for (int i = l; i <= r; i++) // i tuong duong voi so A, l =2, r =4
        // {
        //     for(int j = l; j <= r; j++) // j tuong duong voi so B, l =2 , r= 4
        //     {
        //         if ( i + j == n && i <= j) count++; //Them dieu kien A <= B --> i <= j
        //     }
        // }
        // return count; --> Code bi exceed time
        
        // int a;
        // a = Math.max(n -r, l);
        // int b = n - a;
        
        int count = 0;
        for (int A = l; A <= r; A++) //Duyệt qua tất cả các giá trị có thể của A tù l đến r
        { 
            int B = n - A;
            // Kiểm tra B trong khoảng [l,r] và thỏa mãn A<=B
            if (B >= l && B <= r && A <= B) {
                count++;
            }
        }
    
        return count;
    }
    
}
