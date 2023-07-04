import java.util.Stack;

public class digitsProduct {
    int solution(int product) {
        if(product == 0) return 10;
        if(product<10) return product;
        int temp[] = {9,8,7,6,5,4,3,2};
        int count = 0;

        Stack<Integer> str = new Stack<Integer>();
        for(int i=0; i<8;i++) //CHay i tu 9 - 2, chia từ số to nhất đến số bé nhất
        {
            if(product % temp[i] == 0) // Mỗi khi số product chia hết cho 1 số, thì đẩy số vừa chia hết vào stack
            {
                product /= temp[i];
                str.push(temp[i]);
                count++; //Kiem tra xem product có phải số nguyên tố hay không, nếu count != thì không phải số nguyên tố
                i--; // giảm đi i để sau i++ ở for thì vẫn giữ nguyên i, để số product có thể chia tiếp số i để xem có thể chia tiếp được số nào nữa không
                // Ví dụ: 81 / 9 / 9 = 1, hoặc 81/9 = 9, i++ -> 9/8 -> ko dc -> 9/7 -> ->..... ->
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!str.empty())
        {
            sb.append(str.pop()); // Lấy từ trên xuống các phần từ ở trong stack gán vào sb
            // Vidu: 12 / 6 , và 12 /2 , đứa lần lượt 6 và 2 vào trong stack, khi lấy ra thì lấy 2 rồi lấy 6 cho vào sb --> sb = 26
        }
        if(count == 0 || product != 1)
        //count = 0, tức là số nguyên tố, product != là chia ra dc 1 số nguyên tố VD: 39 / 3 = 13, 13 là nguyên tố ko thể phân tích tiếp --> return -1
            return -1;
        return Integer.parseInt(sb.toString());
        
    }
}
