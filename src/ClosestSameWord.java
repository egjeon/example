import java.util.ArrayList;
import java.util.Arrays;

public class ClosestSameWord {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        String [] sArr = s.split("");
        ArrayList<String> list = new ArrayList<>();
        answer[0] = -1;
        for(int i = 1; i < s.length(); i++) {
            list.add(sArr[i-1]); //ban
            int temp = -1;
            int cnt = 0;
            System.out.println();
            for(int j = list.size()-1; j >= 0; j--) {
                System.out.println("i값 : " + i);
                System.out.println("j값 : " + i);
                System.out.println("보자..: " +  list.get(j));
                System.out.println("비교군 : " + sArr[i]);
                cnt++;
                if(sArr[i].equals(list.get(j))) {
                    temp = cnt;
                    System.out.println("걸렸을때 !!! temp값 : " + temp);
                    break;
                }
            }
            answer[i] = temp;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }

}
