package lv0;

import java.util.Arrays;

public class 뒤에서5등까지 {

    public static int[] solution(int[] num_list) {
        //1, 근이형 방법
        int[] answer = new int[5];
        for(int i = 0 ; i < num_list.length ; i++) {
            for(int j = 0; j < num_list.length; j++) {
                if(num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(num_list));

        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = num_list[i];
        }

      /*  int[] answer = new int[5];

        Arrays.sort(num_list);
        System.out.println(Arrays.toString(num_list));
         //0  1  2   3   4   5   6   ?----- 뒤ㅓ에 몰라용ㅇ형
        //nun_list = {1, 4, 12, 14, 15, 38, 46}       <<<<  삐끄ㅜ 엇 배열 이제벗엇ㅇ낳ㅅ어 터진다잇!!
    //      answer = {0, 15, 38, 0, 0}
        System.arraycopy(num_list, 0, answer, 0, 5);


        System.out.println(Arrays.toString(answer));*/


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, 1, 14}));

    }


}
