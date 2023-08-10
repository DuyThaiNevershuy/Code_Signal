public class SecondRightmostZeroBit {
    int solution(int n) {
        return ~n & ((n | (n + 1)) + 1); // ~: Phep toan NOT // | Phep toan OR  // & Phep toan AND
        
      }
      
}
