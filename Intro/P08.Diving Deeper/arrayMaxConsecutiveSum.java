public class arrayMaxConsecutiveSum {
    int solution(int[] inputArray, int k) {
        // int maxValue = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i = 0; i<inputArray.length;i++){
        //    for(int j=i;j<k-1;j++){
        //         sum+= inputArray[j];
        //         if(sum>maxValue){
        //             maxValue=sum;
        //         }
        //    } 
           
        // }
        // return maxValue;
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        //Tính tổng k số đầu tiên trong dãy
        for(int i=0; i<k; i++){
            sum+= inputArray[i];
        } 
        maxValue=sum; //gán = max
        
        for(int i=k; i<inputArray.length; i++) // tính k phần từ tiếp theo 
        {   
            sum+= inputArray[i]-inputArray[i-k];
            // maxValue=Math.max(maxValue, sum);
            if(sum>maxValue){
                maxValue=sum;
            } 
           
        }
        return maxValue;
    
    }
    
}
