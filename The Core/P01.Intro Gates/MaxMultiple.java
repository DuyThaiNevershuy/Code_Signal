public class MaxMultiple {
    int solution(int divisor, int bound) {
        return bound - (bound % divisor);
    }    
}
