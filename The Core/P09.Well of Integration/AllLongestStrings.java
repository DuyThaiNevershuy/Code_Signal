public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        //Mảng inputArray kiểu String bao gồm các phần tử kiểu String
        String str="";
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<inputArray.length;i++)
        {
            str = inputArray[i];
            if(str.length()>max) //tìm xem độ dài của chuỗi dài nhất là bao nhiêu
            { 
            max = str.length();
            count = 1;
            }
            else if(str.length()==max) count ++; 
            //Biến count để đếm xem có bao nhiêu String trong mảng có độ dài bằng độ dài lớn nhất để cấp phát bộ nhớ cho mảng strRes
        }
        
        String[] strRes = new String[count]; //Tạo 1 mảng String để lưu trữ các String có độ dài max
        int temp = 0;
        for(int i=0; i<inputArray.length;i++)
        {
            if (inputArray[i].length() == max) 
            //Kiểm tra xem nếu các phần tử ở dạng String trong mảng inputArray nếu có độ dài bằng max thì thêm vào mảng strRes
            {
                strRes[temp] = inputArray[i];
                temp++; //Tăng số phần tử của mảng strRes lên để thêm vào các phần tử tiếp theo
            }
        }
        return strRes;
    }
    
}
