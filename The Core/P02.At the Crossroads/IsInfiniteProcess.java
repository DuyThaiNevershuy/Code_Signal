public class IsInfiniteProcess {
    boolean solution(int a, int b) {
        if(b<a) return true;
        else if(Math.abs(a-b) % 2 == 0) return false; //GTTĐ hiệu 2 số là chẵn thì có thể a == b
        else return true;
    }    
}
