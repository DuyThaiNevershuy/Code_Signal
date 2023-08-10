import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseOfCats {
    int[] solution(int legs) {
        List<Integer> list = new ArrayList<>();
        //Tính được số người tối đa có thể có trong mảng
        int maxPeople = legs/2;
        //Tim các phần tử còn lại là khả năng số người có thể có trong mảng
        for(int i=0; i<=maxPeople; i++)
        {
            int catLegs = legs - (i*2); //Tìm lần lượt số cat có thể có 
            if(catLegs % 4 == 0) //Nếu thỏa mãn có 4 chân mèo -> thêm 1 khả năng có cả người và mèo
            {
                list.add(i); //Thêm vào list số phần tử là khả năng có cả người và mèo, trong đó i là số người có thể có trong mảng
            }
        }
        
        //Chuyen ArrayList list sang 1 mang str
        int[] str = new int[list.size()];
        for(int i=0;i < list.size(); i++)
        {
            str[i] = list.get(i);
        }
        Arrays.sort(str);
        return str;
    }
    
    
    
}
