import java.util.Arrays;

public class ConditionSequenceChange2 {

    public static int solution(int[] arr) {
        int answer = 0;
        int idx = 0;
        while(true){

            if(arr[idx] >= 50){
                if(arr[idx]%2==0){
                    arr[idx] =  arr[idx]/2;
                }
            }else{
                if(arr[idx]%2!=0){
                    arr[idx] = arr[idx]*2+1;
                }
            }
            int [] checkArr = arr.clone();
            idx++;

            if(idx > arr.length-1){
                if(Arrays.equals(checkArr, arr)){
                    break;
                }
                answer++;
                idx = 0;
            }
        }
              return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(new int[]{1,2,3,100,99,98}) = " + solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

}
