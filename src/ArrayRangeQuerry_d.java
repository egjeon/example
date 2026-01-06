import java.util.Arrays;

public class ArrayRangeQuerry_d {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int second = queries[i][1];
            int temp = 0;
            temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayRangeQuerry_d q = new ArrayRangeQuerry_d();

        System.out.println(Arrays.toString(q.solution(new int[]{0,1,2,3,4},new int[][]{{0,3},{1,2},{1,4}})));

    }


}
