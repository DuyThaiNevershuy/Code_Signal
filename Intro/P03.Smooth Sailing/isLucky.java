public class isLucky {
    boolean solution(int n) {
        char[] check = Integer.toString(n).toCharArray();
        int count1=0;
        int count2=0;
        if ((check.length) % 2 != 0) return false;
        else{
            for (int i =0; i < check.length/2; i++){
                count1 = count1+ (check[i]);
            }
            for (int i =check.length/2; i< check.length;i++){
                count2=count2+ (check[i]);
            }
        }
        if (count1==count2) return true;
        else return false;
    }    
}
