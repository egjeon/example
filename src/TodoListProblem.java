import java.util.*;

public class TodoListProblem {

    public static String[] solution(String[] todo_list, boolean[] finished) {
        /*String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i])
                list.add(todo_list[i]);
        }
        answer = list.toArray(new String[list.size()]);


       */

        String[] answer = {};
        Map<String, Boolean> map = new LinkedHashMap<>();

        for (int i = 0; i < todo_list.length; i++)
            map.put(todo_list[i], finished[i]);

        int idx = 0;

        answer = new String[todo_list.length];
        for (int i = 0; i < todo_list.length; i++) {
            if(!map.get(todo_list[i])) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return Arrays.copyOf(answer, idx);

        //return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                new boolean[]{true, false, true, false})));
    }
}
