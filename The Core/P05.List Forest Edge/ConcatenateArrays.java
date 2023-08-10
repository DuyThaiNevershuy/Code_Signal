public class ConcatenateArrays {
    int[] solution(int[] a, int[] b) {
        int[] str = new int[a.length + b.length]; //Tạo 1 mảng mới để lưu trữ các phần tử của mảng A và B
        int index = 0;
        for (int i=0; i<a.length; i++) { //Thêm các phần tử mảng A vào mảng str
            str[index] = a[i];
            index++;
        }
        for (int i=0; i<b.length; i++) {  //Thêm các phần tử mảng B vào mảng str
            str[index] = b[i];
            index++;
        }
        return str;
    }
    
}
