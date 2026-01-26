import java.util.Arrays;

public class ThreeBrothers {
    public static int solution(int[] number) {
        int answer = 0;
        int [] arr = new int[3];
        int k = 0;
        //-2, 3, 0, 2, -5 length 5
      /*      0 1 2
            0 1 3
            0 1 4

            1 2 3
            1 2 4

            2 3 4*/

        //-3, -2, -1, 0, 1, 2, 3  length 7
        // 0 1 2
        // 0 1 3
        // 0 1 4
        // 0 1 5
        // 0 1 6

        // 1 2 3
        // 1 2 4
        // 1 2 5
        // 1 2 6

        // 2 3 4
        // 2 3 5
        // 2 3 6

        // 3 4 5
        // 3 4 6

        // 4 5 6


        for(int i = 0; i < number.length-3; i++) {

        }

        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
}
