public class IsSmooth {
    boolean solution(int[] arr) {
        int len = arr.length;
        if(len % 2 == 0)
        {
            //Nếu mảng có chẵn phần tử thì tính tổng vị trí 2 phần tử ở giữa xem có bằng phần tử đầu và cuối hay không
            if(arr[0] == arr[len-1] && (arr[len/2-1]+ arr[len/2] == arr[0]) && (arr[len/2-1]+ arr[len/2] == arr[len-1]))
        
            {
                return true;
            }
            else return false;
        }
        else if(len % 2 != 0 )
        //Nếu mảng có lẻ phần tử thì kiểm tra xem phần tử ở chính giữa mảng  có bằng phần tử đầu và cuối hay không
        {
            if(arr[(len/2)] == arr[0] && arr[(len/2)] == arr[len -1]) return true;
            else return false;
        }
        return false;
    }
    
}
