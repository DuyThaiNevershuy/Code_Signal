public class MetroCard {
    int[] solution(int lastNumberOfDays) {
        if(lastNumberOfDays == 28 || lastNumberOfDays == 30) //Khả năng tháng 1 hoặc tháng 2
            return new int[]{31};
        else return new int[]{28,30,31}; // Các khả năng sau tháng 2
    }    
}
