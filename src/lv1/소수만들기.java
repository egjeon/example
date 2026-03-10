package lv1;

public class 소수만들기 {

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean isPrime = true;
                    int number = 2;
                    int sum = nums[i] + nums[j] + nums[k];
                    while (number < sum) {
                        if (sum % number == 0) {
                            isPrime = false;
                            break;
                        }
                        number++;
                    }
                    if(isPrime) answer++;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        System.out.println("solution = " + solution(new int[]{1,2,7,6,4}));
    }
}
