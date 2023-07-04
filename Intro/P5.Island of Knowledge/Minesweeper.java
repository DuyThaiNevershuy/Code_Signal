public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        int soHang = matrix.length;
        int soCot = matrix[0].length;
        int [][] res = new int [soHang][soCot];
        boolean [][] secMatrix = new boolean[soHang+2][soCot+2];
        for (int i=1; i<=soHang; i++){
            System.arraycopy(matrix[i-1], 0, secMatrix[i], 1, soCot);
        }
        
        for(int i=1; i<=soHang;i++)
        {
            for(int j=1;j<=soCot;j++)
            {
                int count = 0;
                for(int k=i-1; k<= i+1;k++)
                {
                    for(int h= j-1; h<= j+1;h++)
                    {
                        if(k==i && h==j)
                        {
                        continue;
                        }
                    count+= secMatrix[k][h] ? 1 : 0;
                    }
                }  
                res[i-1][j-1] = count;
            }
        }
        return res;
    }    
}
