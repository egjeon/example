import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PickTwoNumberAdd {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                    if(i!=j){
                       set.add(numbers[i]+numbers[j]);
                    }

            }
        }
        Iterator<Integer> iterator = set.iterator();
        answer =  new int[set.size()];
        int k = 0;
        while(iterator.hasNext()){
            int number = iterator.next();
            answer[k++] =  number;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));
    }
}
