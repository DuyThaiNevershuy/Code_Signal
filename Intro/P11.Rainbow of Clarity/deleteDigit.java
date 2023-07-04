public class deleteDigit {
    int solution(int n) {
        // String number = String.valueOf(n);
        // StringBuilder delChar = new StringBuilder(number);
        // StringBuilder instaDigit = new StringBuilder(number);
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<delChar.length();i++)
        // {
        //     delChar.deleteCharAt(i);
        //     if(delChar.charAt(i)>max) return max = Integer.parseInt(delChar.toString());
        //     delChar = instaDigit;
        // }
        // return max;
        char [] arr = String.valueOf(n).toCharArray();
    
        String temp ="";
        int max=Integer.MIN_VALUE; 
        for (int i=0;i<arr.length;i++)
        {
            for (int j = 0;j<arr.length;j++)
                {
                if (j==i) continue; // nếu i -] == j, không thực hiện
                //VD: 3124, i = 0, j  = 0 --> ko làm gì, tăng j = 1, suy ra temp= "1"
                // tăng j = 2, temp = "12", j =3 -> temp = "124"
                //Xong tăng i = 1, j = 0 --> temp ="3"
                // j =1 , i = j = 1 --> ko làm gì, tăng j =2 --> temp = "32", j =2 -> temp = "324"
                temp+=String.valueOf(arr[j]); 
                }
                
            if (Integer.parseInt(temp)>max) max = Integer.parseInt(temp);
            temp=""; // Mỗi khi bỏ 1 chữ số thì lại cho biến temp là xâu rỗng
        }
        return max;
        
        
    }
    
}
