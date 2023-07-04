public class isBeautifulString {
    boolean solution(String inputString) {
        int[] count = new int[26];

        for (int i = 0; i < inputString.length(); i++) { // duyệt từng chữ cái trong bảng chữ cái, thêm các phần tử là
                                                         // số lần xuất hiện của các chữ cái vào mảng count
            // Vi du: chuối: aceedd thì count[1,0,1,2,2,...] vì a = 1; b =0, c=1, d=2, e =2
            // Mảng count có các phần tử với các phần từ là thứ tự xuất hiện lần lượt của 26
            // chữ cái
            count[inputString.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] < count[i + 1])
                return false;
        }
        return true;
    }
}
