public class arrayChange {
    int solution(int[] inputArray) {
        int move = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            while (inputArray[i] >= inputArray[i + 1]) {
                move++;
                inputArray[i + 1]++;
            }
        }
        return move;
    }

}
