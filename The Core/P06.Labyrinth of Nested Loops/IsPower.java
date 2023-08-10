public class IsPower {
    boolean solution(int n) {
        if (n <= 0) {
            return false;
        }
        else if(n == 1) return true; //Mọi số đều mũ 0 thì ra 1
            for (int i = 0; i <= Math.sqrt(n); i++) { // Cho kiểm tra i^j
                for (int j = 0; j<n/2; j++)
                {
                    int power = (int) Math.pow(i, j);
                    if (power == n) {
                    return true;
                }
            }
        }
        return false;
        // double number = (double) n;
        // double check = Math.sqrt(number);
        // boolean isCheck = !Double.isInfinite(check) && !Double.isNaN(check);
        // return isCheck;
        
        // int count = 0;
        // for(int i=0;i<=Math.sqrt(n);i++)
        // {
        //     int pow = (int) Math.pow(i, count);
        //     count++;
        //     if(pow==n)
        //     {
        //         count++;
        //         return true;
        //     }
        //     else return false;
        // }
        // return false;
        
    }
    
}
