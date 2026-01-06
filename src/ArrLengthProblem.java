import java.util.Arrays;

public class ArrLengthProblem {

    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr.length % 2 != 0){
                if(i%2 == 0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
            }else {
                if(i%2 != 0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrLengthProblem obj = new ArrLengthProblem();
        System.out.println(Arrays.toString(obj.solution(new int[]{444, 555, 666, 777}, 100)));
    }
}
