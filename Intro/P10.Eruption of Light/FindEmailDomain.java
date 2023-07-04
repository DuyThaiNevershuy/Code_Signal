public class FindEmailDomain {
    String solution(String address) {
        int index = address.lastIndexOf('@'); // tìm số là vị trí của kí tự @ cuối cùng trong String
        String str = "";
        for (int i = index + 1; i < address.length(); i++) // In từ vị trí @ cuối đến hết chuỗi để lát domain part
        {
            str += address.charAt(i);
        }
        return str;
    }

}
