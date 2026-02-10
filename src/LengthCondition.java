import java.util.Arrays;

public class LengthCondition {
    public static int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length>=11) {
            return Arrays.stream(num_list).sum();
        }else{
            for(int a :  num_list) {
                answer *= a;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println("solution = " + solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
    }

}
