public class ReplaceMiddle {
    int[] solution(int[] arr) {
        int len = arr.length;
        if(len % 2 == 0) //Xét mảng có chẵn phần tử
        {
            int index = 0;
            int[] str = new int[len-1]; //Tạo 1 mảng mới 
            for(int i=0; i<len/2 - 1; i++) //thêm vào mảng mới các phần tử từ đầu(bên trái) 2 phần tử chính giữa của mảng arr
            {
                str[index] = arr[i];
                index++;
            }
            // str[index] = arr[arr[len/2-1]+ arr[len/2]];
            str[index] = arr[len/2-1] + arr[len/2]; //thêm vào mảng str phần tử mới là tổng của 2 phần tử ở giữa mảng ban đầu
            index++;
            for(int i = (len/2) +1; i<len;i++) // tiếp tục thêm các phần tử còn lại bên phải của 2 số chính giữa mảng ban đầu
            {
                str[index] = arr[i];
                index++;
            }
            return str;
        }
        return arr; //Nếu mảng có lẻ số phần tử thì trả về luôn mảng ban đầu
        
    }
    
}
