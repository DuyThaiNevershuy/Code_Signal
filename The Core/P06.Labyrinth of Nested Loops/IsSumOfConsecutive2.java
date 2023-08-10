public class IsSumOfConsecutive2 {
    int solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            int sum = i;
            for(int j=i+1; j<n;j++) //Cho j chạy từ i+1 đến n-1, để cộng dần rồi so sánh với n
            {
                if((sum+=j) > n) break;  //Nếu như sum vượt quá số n --> ko có tổng các chữ số thỏa mãn thoát khỏi vòng for, tăng i thêm 1
                else if (sum == n) count++;
                // Ví dụ khi n = 9; đầu tiên sẽ chạy đến i = 3 thì dc 2+3 = 5, vòng for tăng i và j lên 1
                // Khi chạy đến i=4, dc 2+3+4 = 9, count++
            }
        }
        return count;
    }
    
}
