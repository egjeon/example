import java.util.*;

public class AddUnknownNumber {
    public static int solution(int[] numbers) {
        int answer = -1;
        int result = 0;

        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(numbers);

        for(int i = 0; i <=9; i++){
            set.add(i);
        }

        for(int i = 0; i < numbers.length; i++){
            if(set.contains(numbers[i])){
               set.remove(numbers[i]);
            }
        }

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            result += iterator.next();
        }

        if(result != 0){
            return result;
        }

        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
