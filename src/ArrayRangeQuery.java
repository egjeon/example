import java.util.Arrays;

public class ArrayRangeQuery {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [arr.length];
        for (int i = 0; i < queries.length; i++) {
            System.out.println(i);
            for(int j= queries[i][0]; j<= queries[i][1]; j++){
                System.out.println("J : " + j);
                arr[j] += 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0,1,2,3,4},new int[][]{{0,1},{1,2},{2,3}})));
    }
}
