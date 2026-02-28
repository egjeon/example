import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ad제거하기 {

    public static String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad"))
                list.add(strArr[i]);
        }
        answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"there","are","no","a","ds"})));
    }
}
