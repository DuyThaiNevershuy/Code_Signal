public class MakeArrayConsecutive2 {
    int solution(int[] statues) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i < statues.length ; i++){
            if (statues[i] < min) min = statues[i];
            if (statues[i] > max) max = statues[i];
        }
        int tg = max - min +1 ; // số đầu trừ số cuối để ra số số hạng trong dãy
        return tg - statues.length; // trừ đi để tìm những số tượng còn sót lại
        
    }    
}
