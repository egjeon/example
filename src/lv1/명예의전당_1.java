package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 명예의전당_1 {
    public static int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int [] answer = {};
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++){
            if(min > score[i]){
                min = score[i];
            }
            list.add(score[i]);
            resultList.add(min);
        }


        for(int i = k; i < score.length; i++){
            if(min < score[i]){
                list.remove(min);
                list.add(score[i]);
            }

            resultList.add(min);
        }

        System.out.println(resultList);





        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
}
