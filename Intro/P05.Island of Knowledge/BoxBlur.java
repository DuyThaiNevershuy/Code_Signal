public class BoxBlur {
    int[][] solution(int[][] image) {
        int soHang= image.length;
        int soCot= image[0].length;
        int [][] sum = new int[soHang-2][soCot-2];
        for (int i=0;i<soHang-2;i++){
            for(int j=0;j<soCot-2; j++){
                for(int k=i;k<i+3;k++){
                    for(int h=j;h<j+3;h++){
                        sum[i][j]+= image[k][h];
                    }
                }
            sum[i][j] /= 9;
            }
        }
        return sum;
    }    
}
