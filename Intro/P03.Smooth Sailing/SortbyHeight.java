public class SortbyHeight {
    int[] solution(int[] a) {
        for (int i =0; i< a.length - 1;i++ ){
            if (a[i] == -1) continue;
            for (int j =i+1;j<a.length;j++) 
            {
                if (a[j]==-1) continue;
                if (a[i]>a[j]){
                int tmp = a[i];
                a[i]=a[j];
                a[j]=tmp;
                }
            }
        }
        return a;
    }    
}
