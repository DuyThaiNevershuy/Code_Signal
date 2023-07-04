public class arrayMaximalAdjacentDifference {
    int solution(int[] inputArray) {
        int maxArr=0;
        for (int i=0;i<inputArray.length-1;i++){
            maxArr = Math.max(maxArr,Math.abs(inputArray[i]-inputArray[i+1]));
        }
        return maxArr;
    }    
}
