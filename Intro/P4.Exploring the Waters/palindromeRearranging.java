import java.util.Arrays;

public class palindromeRearranging {
    boolean solution(String inputString) {
        int count[] = new int[26];
        Arrays.fill(count, 0);
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'a']++; // lưu số lượng mỗi ký tự có trong chuỗi

            // count[(int)(inputString.charAt(i))]++;
        }
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0)
                oddCount++; // biến đếm xem có bao nhiêu loại ký tự lẻ (trong đề thì chỉ được có duy nhất 1
                            // loại ký tự có số lượng lẻ)

        }
        if (oddCount > 1)
            return false;
        else
            return true;

    }

}
