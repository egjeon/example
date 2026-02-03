import java.util.ArrayList;
import java.util.Arrays;

public class OrderChange {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        int size = 0;
        for(int i = n; i < num_list.length; i++){
            answer[idx++] = num_list[i];
            size++;
        }
        for(int i = 0; i < num_list.length-size; i++){
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
    }


}
