public class AddBorder {
    String[] solution(String[] picture) {
        int soHang= picture.length;
        int soCot=picture[0].length();
        
        String[] matrix = new String[soHang+2];
        //Them dau * o tren va cuoi cua String
        matrix[0]= matrix[soHang+1] = "*".repeat(soCot +2 );
        // them dau * vao trai va phai
        for (int i=1;i<=soHang;i++){
            matrix[i]="*"+ picture[i-1] +"*";
        }
        return matrix;
    }    
}
