package lv1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n){
        int [] answer = {};
        String [] arr = String.valueOf(n).split("");
        answer = new int[arr.length];

        int idx = 0;

        for(int i=arr.length-1;i>=0;i--)
            answer[idx++] = Integer.parseInt(arr[i]);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(123456789)));
    }
}
