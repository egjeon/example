import java.util.Arrays;

public class LastTwoFactors {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length+1];
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] =
                    num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length - 1] =
                    num_list[num_list.length - 1] * 2;
        }
        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        LastTwoFactors ltf = new LastTwoFactors();
        System.out.println(Arrays.toString(ltf.solution(new int[]{5, 2, 1, 7, 5})));
    }

}
