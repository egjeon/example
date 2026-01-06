import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRangeQuerry {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int minVal = 1000000;
            boolean found = false;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (arr[j] < minVal) {
                        minVal = arr[j];
                        found = true;
                    }
                }
            }
            if (found) {
                answer[i] = minVal;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3},new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}})));
    }
}
