public class alternatingSums {
    int[] solution(int[] a) {
        int s1=0, s2=0;
        for (int i=0; i<a.length;i++){
            if (i%2==0)  s1+=a[i];
            else s2+=a[i];
        }
        int [] sum= new int [2];
        sum[0] = s1;
        sum[1]=s2;
        return sum;
    }    
}
