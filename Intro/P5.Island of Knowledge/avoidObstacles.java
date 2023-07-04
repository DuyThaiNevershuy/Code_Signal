public class avoidObstacles {
    int solution(int[] inputArray) {
        int jump = 1;
        for (int i=0;i<inputArray.length;i++){
            if(inputArray[i]%jump==0){
                //cac so trong phan tu chia het cho jump thi trung ==> loai, cho i=-1 chay lai tu dau va tang gia tri jump len duyet lai lan nua 
                jump++;
                i=-1;
            }
        }
        return jump;
    }    
}
