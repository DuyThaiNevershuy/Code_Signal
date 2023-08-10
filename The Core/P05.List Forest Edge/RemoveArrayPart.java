public class RemoveArrayPart {
    int[] solution(int[] inputArray, int l, int r) {
        // int len = inputArray.length;
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        // for(int i : inputArray)
        // {
        //     newArr.add(i);
        // }
        // for (int i=l; i<=r;i++)
        // {
        //     newArr.remove(i);
        // }
        // int[] str = new int[newArr.size()];
        // for (int i = 0; i < newArr.size(); i++) {
        //         str[i] = newArr.get(i);
        //     }
        // return str;
        int newSize = inputArray.length - (r - l + 1);
        int[] newArr = new int[newSize]; //Tạo 1 mảng mới để lữu trữ các phần tử
        int index = 0;
        for(int i = 0;i < l; i++) //thêm các phần tử từ 0 đến phần tử thứ l - 1
        {
            newArr[index] = inputArray[i];
            index++;
        }
        for(int i = r + 1;i < inputArray.length; i++) ///thêm các phần tử từ r + 1 đến hết mảng
        {
            newArr[index] = inputArray[i];
            index++;
        }
        return newArr;
    }
    
}
