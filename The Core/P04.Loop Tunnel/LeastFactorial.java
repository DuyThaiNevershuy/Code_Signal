public class LeastFactorial {
    int solution(int n) {
        //tim k de k>=n voi k la i!
        int k = 1;
        int i = 1;
        while(k<n)
        {
            k=k*i;
            i++;
        }
        return k;
    }
    
}
