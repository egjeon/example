import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 다섯명씩 {
    public static String[] solution(String[] names) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
                if(i%5 == 0)
                    list.add(names[i]);

        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }
}
