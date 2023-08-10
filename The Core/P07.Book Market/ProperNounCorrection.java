public class ProperNounCorrection {
    String solution(String noun) {
        String str = noun.substring(0, 1).toUpperCase() + noun.substring(1).toLowerCase();
        //Cho 1 kí tự đầu là chuỗi con rồi uppercase và các kí tự từ kí tự thứ 2 trở đi ở trong 1 substring khác và lowercase
        return str;
    }
    
}
