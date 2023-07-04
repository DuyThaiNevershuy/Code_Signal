import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class extractEachKth {
    int[] solution(int[] inputArray, int k) {
        // ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inputArray));
        // List<Integer> list = new ArrayList<Integer>();
        
        // LAM 
        //Đổi mảng sang List
        List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
        // List<Integer> list = Arrays.stream(inputArray).boxed().toList();
        //xoa cac phần tử thứ k trong mảng
        for(int i = k-1; i<list.size();i+=k-1){
            list.remove(i);
        }
        //tạo 1 mảng mới để lưu trữ các phần tử của mảng list sau khi đã xóa đi các phần tử thứ k
        int[] str = new int[list.size()];
        for(int i=0;i<list.size();i++){
            str[i] = list.get(i);
        }
        return str;
        
        // int[] outputArray = list.stream().mapToInt(Integer::intValue).toArray();
        // return outputArray;
        // LAM
        
        // List<Integer> d = new ArrayList<>();
    
        //    for (int i1 : inputArray) {
        //        d.add(i1);
        //    }
    
        //     for (int i = k-1; i < d.size(); i += k-1) {
        //         d.remove(i);
        //     }
    
        //     System.out.println(d.toString());
    
        //     int[] ff = new int[d.size()];
        //     for (int i = 0; i < d.size(); i++) {
        //         ff[i] = d.get(i);
        //     }
        //     return ff;
        
        
        // List<Integer> list = new ArrayList<>();
        //     for (int num : inputArray) {
        //         list.add(num);
        //     }
            
        //     // Remove every k-th element
        //     for (int i = k - 1; i < list.size(); i += k) {
        //         list.remove(i);
        //     }
            
        //     // Convert List back to array
        //     int[] outputArray = new int[list.size()];
        //     for (int i = 0; i < list.size(); i++) {
        //         outputArray[i] = list.get(i);
        //     }
            
        //     return outputArray;
    
    }
    
}
