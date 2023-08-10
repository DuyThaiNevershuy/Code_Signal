public class MinimalNumberOfCoins {
    int solution(int[] coins, int price) {
        int count = 0;
        int i=coins.length-1;
        
        //Cho vong while chạy đến khi price = 0
        while(price>0)
        {
            // Duyệt phần tử của mảng coins từ phải sang trái, từ phấn tử lớn nhất trong mảng
            if(price >= coins[i]) 
            {
                int check = price/coins[i]; // Check xem có thể sử dụng mấy lần giá trị coins[i] VD: 28/10 = 2
                count += check; //Count = 2
                price -= check*coins[i]; // price = 28 - 2* 10
                i--; // Duyệt phần tử coint[len -1] tiếp đến phần tử tiếp theo bên trái coins[len -2 ] (xét phần tử 10 --> xét phần tử 2)
            }
            else i--; //Nếu phần tử thứ coins[i] < price, thì phải xét đến phần tử bên trái có giá trị bé hơn coint[i], VD price = 9 thì ko xét dc coint[i] = 10
        }
        return count;
    }
    
}
