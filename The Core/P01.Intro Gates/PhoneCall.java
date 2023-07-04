public class PhoneCall {
    int solution(int min1, int min2_10, int min11, int s) {
        // int count = 0;
        // int afteMin1 = s- min1;
        // while(count <= s)
        // {
        //     if(s-min1 > s) break;
        //     else if(s-min1 == s) 
        //     {
        //         count++;
        //         break;
        //     }
        //     else{
        //         for(int i=2; i<=10; i++)
        //         {
        //             s = s- min2_10;
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int count = 0;
        if(s<min1) return count = 0;
        else if (s== min1 ) return count = 1;
        else if(s >= min1 + min2_10 && s <= min1+ 9*min2_10) //Moc 2
        {
            return count = 1+ (s - min1) / min2_10;
        }
        else return count = 10 + (s - (min1 + 9*min2_10)) / min11; //Moc 3
        
    }
    
}
