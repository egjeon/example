import java.util.ArrayList;
import java.util.List;

public class SpecialSequenceSum {
    public static int solution(int a, int d, boolean[] included) {
        int answer = a;
        int [] arr = new int[included.length];
        arr[0] = a;
        for(int i = 1; i < included.length; i++){
                answer += d;
                arr[i] = answer;
        }
        answer  = 0;
        for(int i = 0; i < arr.length; i++){
            if(included[i]){
                answer += arr[i];
            }
               System.out.println("arr = " + arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean[] included = {false, false, false, true, false, false, false};
        System.out.println(solution(7,1,included));
    }
}
