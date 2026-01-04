import java.util.Arrays;

public class MakeArray1 {
    public int[] solution(int n, int k) {
        int[] answer = new int [n/k];

        for (int i = 1; i < answer.length+1; i++)
            answer[i-1] = k*i;

        return answer;
    }

    public static void main(String[] args) {
         MakeArray1 ma = new MakeArray1();
         System.out.println(Arrays.toString(ma.solution(10,3)));
    }
}
