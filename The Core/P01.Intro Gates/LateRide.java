public class LateRide {
    int solution(int n) {
        int sum1 =0;
        int sum2 = 0;
        int hour = n/60;
        int min = n%60;
        while(hour>=1)
        {
            sum1+=hour%10;
            hour/=10;
        }
        while(min>=1)
        {
            sum2+=min%10;
            min/=10;
        }
        return sum1+sum2;
    }
    // 1:// hout = 13   
    // hour = hour % 10;    = 3
    // sum1+=hour;      0+3=3
    // hour/10;        3/10 = 0 --> thoat luon vong while vi 3> 1;
    // 2:  sum1+=hour%10;   sum1 = 0 + 3 = 3
    //     hour/=10           hour = 13/10 = 1
    //   vong while thu 2: sum1 = 3 + hour%10 = 3 +1;
    //                       hour = 1/10 = 0, dung vong for vi <1
        
    
    
}
