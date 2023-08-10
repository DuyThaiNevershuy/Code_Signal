public class HouseNumbersSum {
    int solution(int[] inputArray) {
        // Đề bài sẽ dc hiểu cộng tổng các số trong dãy, khi nào đến phần tử = 0 thì dừng lại không cộng nữa
        int sum = 0;
        for(int i=0; i< inputArray.length;i++)
        {
            if(inputArray[0] == 0) return 0; //Kiểm tra nếu ngay từ đầu đã gặp nhà số = 0 thì không cộng,return 0 luôn
            else
            {
                sum+=inputArray[i]; //Cộng tổng các số nhà đi qua
                if(inputArray[i]==0) break; //Nếu gặp số nhà = 0, dừng cộng luôn
            }
        }
        return sum; 
    }
    
}
