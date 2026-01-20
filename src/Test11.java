import java.util.Arrays;

public class Test11 {


    public static int solution(int[] numbers) {
        int answer = -1;
        int result = 0;
        int [] standardArr = {0,1,2,3,4,5,6,7,8,9};
        //             arr = [0,1,2,3,4,6,7,8,0,0]
        int [] arr = new int [standardArr.length];
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            arr[i] = numbers[i];
        }
        int k = 0;
        for(int i = 0; i < standardArr.length; i++){
                if(standardArr[i] != arr[k]){
                    result += standardArr[i];
                    k--;
                }
                k++;
        }
        if(result > 0){
            return result;
        }
        System.out.println("result = " + result);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }
}
