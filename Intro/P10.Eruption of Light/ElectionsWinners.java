import java.util.Arrays;

public class ElectionsWinners {
    int solution(int[] votes, int k) {
        Arrays.sort(votes); // sap xếp mảng số người có số phiếu từ lớn đến bé
        int len = votes.length;
        int count = 0;
        if (k == 0 && votes[len - 1] != votes[len - 2])
            return 1; // Nếu như k = 0 và ko có ít nhất 2 người cùng số phiếu mà cả 2 đều có số phiếu
                      // max thì trả về 1 vì chỉ có 1 người win chính là người có số phiếu lớn nhất
                      // trong tất cả(check test 3)
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > votes[len - 1]) {
                count++;
            }
        }
        return count;
    }

}
