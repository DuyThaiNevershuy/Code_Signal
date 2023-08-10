public class FirstReverseTry {
    int[] solution(int[] arr) {
        // List<Integer> list =new ArrayList<>();
        // for(int i =0 ;i<arr.length;i++)
        // {
        //     list.add(arr[i]);
        // }
        // Collections.reverse(list);
        // int[] array = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) 
        // {
        //     array[i] = list.get(i);
        // }
        // return array;
        if (arr.length < 2) return arr; 
        else
        {
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        return arr;
    }
    
}
