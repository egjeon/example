import java.util.Arrays;

public class ArrayRangeQuery3 {

    public static int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4},new int[][]{{0,3},{1,2},{1,4}})));
    }

}
