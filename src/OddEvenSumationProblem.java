public class OddEvenSumationProblem {
    /**
     * n	result
     * 7	16
     * 10	220
     * 입출력 예 설명
     * 입출력 예 #1
     *
     * 예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
     * 입출력 예 #2
     *
     * 예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 22 + 42 + 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
     *
     *
     * 1 2 3 4 5
     *           2*i-1 = 홀수 1 3 5 7 9
     *           1
     *           2*i = 짝수 2 4 6 8 10
     */
    public int solution(int n) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        int k = 1;

        if(n%2==0){                 //10
            while(2*k<=n){
                evenSum += (2*k)*(2*k);
                k++;
            }
        }else{
            while(2*k-1<=n){
                oddSum += 2*k-1;
                k++;
            }
        }

        answer = n%2 == 0 ? evenSum : oddSum;

        return answer;
    }

    public static void main(String[] args) {
        OddEvenSumationProblem  oddp = new OddEvenSumationProblem();
        System.out.println(oddp.solution(7));
    }
}
