public class Kill_Kth_bit {
    int solution(int n, int k) {
        return ~(1 << k-1) & n ;
      }
      
}
