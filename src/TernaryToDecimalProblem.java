import java.util.ArrayList;
import java.util.List;

public class TernaryToDecimalProblem {

    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n%3);
            n = n/3;

        }
        int exp = 0;
        for(int i = list.size()-1; i >= 0; i--){
           answer+= (int)(list.get(i)*Math.pow(3,exp++));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
