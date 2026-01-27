import java.util.Arrays;

public class ThreeBrothers {
    public static int solution(int[] number) {
        int answer = 0;
        for(int i =0; i <= number.length-3; i++){
            for(int j = i+1; j <= number.length-2; j++){
                for(int k = j+1; k <= number.length-1; k++){
                    if(number[i]+number[j]+number[k]==0)
                        answer++;
                }
            }
        }
        return answer;
        /*i = 0;               (length - 2)-i
        5
        4
        3
        2
        1
        i = 1;

        4
        3
        2
        1
        i = 2;
        3
        2
        1

        i = 3
        2
        1

        i = 4
        1
*/

    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 1, -1, 1})); //5
    }
}
