public class isIPv4Address {
    boolean solution(String inputString) {
        int len = inputString.length();
        if (len > 15 || len < 7) {
            return false;
        }
        String[] str = inputString.split("[.]");
        if (str.length != 4) {
            return false;
        }
        try {
            for (String s : str) {
                // chuyen string ve so nguyẹ
                int temp = Integer.parseInt(s);
                if (temp < 0 || temp > 255) {
                    return false;
                }
                // so sanh khi chuyen so ve string , vì dia chi IP ko co 255.003.003.145,,
                // chuyển để kiểm tra xem 003 xem có bằng 3 hay không
                // so sanh số sau khi chuyển về số nguyên có bằng chuỗi ban đầu hay không
                String number = String.valueOf(temp);
                if (!number.equals(s)) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
