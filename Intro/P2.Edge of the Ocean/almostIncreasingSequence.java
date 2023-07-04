public class almostIncreasingSequence {
    boolean solution(int[] sequence) {
        int len = sequence.length;
        if(len<3){
            return true;
        }
        int count = 0;
        for(int i = 0; i<len-1; i++){
            if(sequence[i]>=sequence[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                if(i>0 && i<len-2 && sequence[i]>=sequence[i+2] && sequence[i-1]>=sequence[i+1]){
                    return false;
                }
            }
        }
        return count < 2;
    }
    
}
