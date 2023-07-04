public class matrixElementsSum {
    int solution(int[][] matrix) {
        int soHang= matrix.length;
        int soCot= matrix[0].length;
        int tong=0;
        for (int i=0;i<soCot; i++){
            for (int j=0; j < soHang; j++){
                if (matrix[j][i] != 0)  tong += matrix[j][i];
                else break;
            }
        }
        return tong;
    }
    
}
