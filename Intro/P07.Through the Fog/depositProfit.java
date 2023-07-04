public class depositProfit {
    int solution(int deposit, int rate, int threshold) {
        int count = 0;
        double soDu = deposit;
        double tiLe= rate;
        while(soDu < threshold)
        {
            soDu += (soDu * (tiLe/100));
            count++;
        }
        return count;
    }    
}
