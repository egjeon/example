import java.util.Arrays;

public class BoundaryOfTheTwo {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        boolean fFlag = true;
        boolean lFlag = false;
        boolean mFlag = false;

        int firstIdx = 0;
        int lastIdx = 0;

        for(int i = 0; i < arr.length; i++){
            if(fFlag && arr[i] == 2){
                firstIdx = i;
                fFlag = false;
                lFlag = true;
                mFlag = true;
            }else if(lFlag && arr[i] == 2){
                lastIdx = i;
            }
        }

        if(!mFlag){
            answer = new int[1];
            answer[0] = -1;
        }
        if(mFlag && lastIdx == 0){
            lastIdx = firstIdx;
        }

        if(mFlag&&lastIdx - firstIdx == 0){
            answer = new int[1];
            answer[0] = arr[firstIdx];
        }else if(mFlag){
            answer = new int[lastIdx - firstIdx + 1];
            int idx = 0;
            for(int i = firstIdx; i <= lastIdx; i++){
                answer[idx++] = arr[i];
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
    }


}
