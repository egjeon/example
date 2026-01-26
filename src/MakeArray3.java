import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {}; // size = 0  빈상태
        List<Integer> list = new ArrayList<>();
        // {{1,3},{0,4}}
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }

        answer =  new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5},new int[][]{{1,3},{0,4}})));
    }
}
