public class digitDegree {
    int solution(int n) {
        int count = 0;
        if (n < 10)
            return 0; // neu so la so co 1 chu số --> suy ra 0
        else // nếu n >= 10 thì số n sẽ là tách tiêp
        {
            while (n >= 10) {
                n = check(n);
                // mỗi lần chạy hàm check count + 1;
                count++;
            }
        }
        return count;
    }

    int check(int n) {
        int res = 0;
        // Tính tổng các chữ số
        while (n >= 1) {
            res += (n % 10);
            n = n / 10;
        }
        return res;
    }

}
