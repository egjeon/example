import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RightOrLeft {
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        int lIdx = 0;
        boolean control = false;
        int rIdx = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                lIdx = i;
                control = true;
                break;
            } else if (str_list[i].equals("r")) {
                rIdx = i;
                break;
            }
        }

        if (rIdx == 0 && lIdx == 0) {
            return answer;
        }
        if (control) {
            for (int i = 0; i < lIdx; i++) {
                list.add(str_list[i]);
            }
            answer = list.toArray(new String[list.size()]);

        } else {
            for (int i = rIdx + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
            answer = list.toArray(new String[list.size()]);
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
    }
}
