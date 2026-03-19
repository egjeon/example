package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공백으로구분하기2 {



    public static String[] solution(String my_string) {
        String [] arr = my_string.split(" ");

        List<String> list = new ArrayList<>();

        //>>> >>> >> >>> >>> >>> javaScript

        //>>> >>> >> >>> >>> >>> JAVA





        System.out.println(Arrays.toString(arr));
        String [] answer = {};
        String [] ccc = {"원도윤","전은광","이양원","김유경"};
        System.out.println(ccc[0]);

        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(""))
                list.add(arr[i]);
        }
        answer = new String[list.size()];

        for(int i = 0 ; i < list.size() ; i++)
            answer[i] = list.get(i);


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(" i    love  you")));
    }
}
