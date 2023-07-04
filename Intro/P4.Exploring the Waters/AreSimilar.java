public class AreSimilar {
    boolean solution(int[] a, int[] b) {
        int a1 = 0, b1 = 0, a2 = 0, b2 = 0;
        int count = 0;
        // Duyệt dọc phần tử của 2 mảng, lần lượt a[0],b[0] xong đến a[1], b[1], nếu
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
                if (count == 1) {
                    a1 = a[i];
                    b1 = b[i]; // gán cặp giá trị khác nhau vào 2 số a1 và b1
                } else if (count == 2) {
                    a2 = a[i];
                    b2 = b[i]; // gán cặp giá trị khác nhau vào 2 số a2 và b2
                } else
                    break;
            }
        }
        if (count == 0)
            return true; // count =0--> ko có cặp số nào khác nhau, luôn đúng
        if (count == 1)
            return false;
        if (count == 2)
            return (a1 == b2 && a2 == b1);
        // nếu như có 2 cặp số khác nhau mà 2 cặp số ấy hoán đổi vị trí mà bằng nhau thì
        // đúng, count ==1 thì sai

        return false;
    }
    // Arrays.sort(a);
    // Arrays.sort(b);
    // return Arrays.equals(a, b);

}
