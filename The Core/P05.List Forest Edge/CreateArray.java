import java.util.Arrays;

public class CreateArray {
    int[] solution(int size) {
        int[] array = new int[size]; //tạo 1 mảng có kích thước size
        Arrays.fill(array, 1); //Thêm toàn bộ mảng đều là giá trị 1
        return array;
    }
    
}
