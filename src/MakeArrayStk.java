import java.util.ArrayList;
import java.util.Arrays;

public class MakeArrayStk {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] stk = {};
        for (int i = 0; i < arr.length; i++) {
            if(list.size() == 0){
                list.add(arr[i]);
            }else{
                if (arr[i] > list.get(list.size() - 1)) {
                    list.add(arr[i]);
                    //i++;
                }else{
                    list.remove(list.size() - 1);
                    i--;
                }
            }
        }
        stk = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }
        return stk;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 3, 4, 1, 2})));
    }
}
