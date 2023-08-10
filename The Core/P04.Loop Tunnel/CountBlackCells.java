public class CountBlackCells {
    int solution(int n, int m) {
        return n + m + gcd(n, m) - 2;
}
int gcd(int a, int b) { //Hàm đệ quy tìm ước số chung lớn nhất của 2 số a và b
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); //Đệ quy
    }


}
