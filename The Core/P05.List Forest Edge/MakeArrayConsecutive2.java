import java.util.Arrays;

public class MakeArrayConsecutive2 {
    int solution(int[] statues) {
        Arrays.sort(statues); //sắp xếp mảng các phần tử từ bé đến lớn
        int len = statues.length;
        return (statues[len-1] - statues[0] + 1) - len; // Tính số chữ số giữa số đầu và số cuối trừ đi len --> ra số chữ số bị thiếu
    }
    
}
