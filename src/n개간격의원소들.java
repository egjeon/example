import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n개간격의원소들 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
            for(int i = 0; i < num_list.length; i++){
                if(i%n==0)
                    list.add(num_list[i]);
            }
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("solution(new int[]{4, 2, 6,1,7, 6}, 2) = " + Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 4)));
    }

}
