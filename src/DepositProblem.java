import java.util.Arrays;

public class DepositProblem {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            temp += d[i];
            if (temp <= budget) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }
}
