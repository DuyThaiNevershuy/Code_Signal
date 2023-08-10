public class HTMLEndTagByStartTag {
    String solution(String startTag) {
        //Bỏ dấu ngoặc nhọn mở và ngoặc nhọn đóng từ thẻ bắt đầu
        String tag = startTag.substring(1, startTag.length() - 1);
    
        // Kiểm tra nếu startTag là thẻ tự đóng
        if (tag.endsWith("/")) {
            return ""; // Không cần thẻ kết thúc cho thẻ tự đóng
        }
    
        // Lấy tên thẻ trên 1 string dựa trên khoàng trắng là điểm tách, tách chuỗi thành 1 các phần tử 
        // Lấy phần tử đầu tiên trong mảng sau khi tách dựa trên khoảng trắng vì phần tử đầu tiên vì nó là tên thẻ
        String tagName = tag.split(" ")[0];
    
        // Trả về thẻ kết thúc với đúng cú pháp
        return "</" + tagName + ">";
    }
    
}
