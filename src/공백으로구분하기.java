import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공백으로구분하기 {

    public static String[] solution(String my_string) {
        String [] sArr = my_string.split(" ");
        return sArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
    }
}
