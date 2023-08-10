public class MagicalWell {
    int solution(int a, int b, int n) {
        int sum = 0;
        for (int i = 0; i<n; i++)
        {
            sum += a*b; //tổng tiền nhận được
            a++;
            b++;
        }
        return sum;
        
    }
    
}
