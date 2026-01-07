import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuffixArrayProblem {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> strList = new ArrayList<String>();
        for(int i = 0 ; i < my_string.length() ; i++){
            strList.add(my_string.substring(i,my_string.length()));
        }
        //strList.sort(String::compareTo);

        answer = new String[strList.size()];
        Collections.sort(strList);
        //Collections.reverse(strList);
        for(int i =  0; i < answer.length; i++){
            answer[i] = strList.get(i);
        }
        //Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        SuffixArrayProblem sap = new SuffixArrayProblem();
        System.out.println(Arrays.toString(sap.solution("banana")));
    }
}
