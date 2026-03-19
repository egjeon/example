package lv0;

import java.util.Arrays;

public class 뒤에서5등위로 {

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int idx = num_list.length - 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[idx--];
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
