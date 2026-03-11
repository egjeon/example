package lv1;

import java.util.ArrayList;
import java.util.List;

public class 푸드파이트대회 {

    public static String solution(int[] food) {
        String answer = "";
        List<String> strList = new ArrayList<String>();

        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++)
                strList.add(String.valueOf(i));
        }
        strList.add("0");

        System.out.println(strList.toString());

        for(int j = strList.size()-2; j >= 0; j--){
            strList.add(strList.get(j));
        }

        System.out.println(strList.toString());

        for(int j = 0; j < strList.size(); j++){
            answer += strList.get(j);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }
}
