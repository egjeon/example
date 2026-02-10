import java.util.Arrays;

public class ConditionSequenceChange2 {

    public static int solution(int[] arr) {
        int answer = 0;
            while (true) {
                int[] prevArr = arr.clone();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        arr[i] /= 2;
                    } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                        arr[i] = arr[i] * 2 + 1;
                    }
                }
                if (Arrays.equals(prevArr, arr)) {
                    break;
                }
                answer++;
            }

              return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(new int[]{1,2,3,100,99,98}) = " + solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

}
