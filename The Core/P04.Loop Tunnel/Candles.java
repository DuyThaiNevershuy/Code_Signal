public class Candles {
    int solution(int candlesNumber, int makeNew) {
        int left = candlesNumber;
        int count=candlesNumber; //So nến có sẵn ban đầu đốt ngay
        while (left >= makeNew) //Chay cho đến khi số lượng leftover còn lại bé hơn số makenew để làm ra 1 cây nến
        {
            int candles = left/makeNew; //Số nến làm được bằng tổng chia cho số lượng cần makeNew lấy nguyên
            count += candles; // đếm dc bao nhiêu cây nến làm ra
            left-= makeNew* candles; // Số leftover còn lại sau mỗi lần tạo ra nến
            left += candles; //Sau khi đốt xong candles nến thì còn lại left + candles số nguyên liệu (leftover)
            // số leftover = số cây nến sau khi đã đốt
        }
        return count;
    }
    
}
