public class chessBoardCellColor {
    boolean solution(String cell1, String cell2) {
        char[] s1 = cell1.toCharArray();
        char[] s2 = cell2.toCharArray();
        //Tong 4 ki tu dau của 2 string vao theo bang ma ASCII , neu tong chan thi tra ve True
        if (((s1[0] + s2[0] + s1[1] + s2[1]) % 2) == 0) return true;
        else return false;
    }    
}
