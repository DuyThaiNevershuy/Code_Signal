public class growingPlant {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int count=0;
        int heightOfTree=0;
        while(heightOfTree<desiredHeight){
            heightOfTree= heightOfTree+upSpeed; // ban ngày cây lớn 
            count++; // hết 1 ngày
            if(heightOfTree>=desiredHeight) break; 
            //nếu ban ngay cây đã đủ lớn thì break, tính là 1 ngày --> chưa đến đêm thì cây đã đủ chiều cao
            else{ //còn cây chưa đủ lớn thì sẽ xét tiếp đến ban đêm và tiếp tục vòng lặp sang ban ngày của ngày thứ 2
                heightOfTree= heightOfTree-downSpeed;
                continue;
            }
            
        }
        return count;
        // double res =  (desiredHeight-downSpeed)/(upSpeed-downSpeed);
        // return Math.ceil(res) ;
        
    }    
}
