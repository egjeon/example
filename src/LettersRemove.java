import java.util.*;

public class LettersRemove {
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        String [] strArr = my_string.split("");

        for(int i = 0; i < indices.length; i++){
            strArr[indices[i]] = "";
        }

        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals(""))
                answer += strArr[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }

}
