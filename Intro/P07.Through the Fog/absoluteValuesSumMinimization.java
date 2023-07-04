public class absoluteValuesSumMinimization {
    int solution(int[] a) {

        // Gần các phần tử nhất của mảng --> Luôn luôn là phần tử ở giữa
        // Nếu số phần tử là chẵn thì lấy số thứ n/2 hoặc ()n/2) -1
        // return a[(a.length-1)/2];

        if ((a.length) % 2 == 0)
            return a[(a.length / 2) - 1];
        else
            return a[(a.length - 1) / 2];

    }

}
