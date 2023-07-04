public class ValidTime {
    boolean solution(String time) {
        String[] str = time.split(":"); //Tách chuỗi bởi kí tự : và lưu vào str
        if((Integer.parseInt(str[0]) >= 0 && Integer.parseInt(str[0]) <= 23) && (Integer.parseInt(str[1])>=0 && Integer.parseInt(str[1])<=59)) return true;
        else return false;
    }
    
}
