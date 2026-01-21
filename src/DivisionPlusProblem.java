public class DivisionPlusProblem {
    /**
     *   left 13
     *         right 17
     *         13 17
     *         13 << 1,13  2       13+14+15-16+17 = > 43
     *         14 << 1,2,7,14  4
     *         15 << 1,3,5,15  4
     *         16 << 1,2,4,8,16 5
     *         17 << 1,17    2
     * @param left
     * @param right
     * @return
     */
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int cnt = 0;
            for(int j = 1; j <=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            answer = cnt%2 == 0 ? answer+i : answer-i;
        }
        return answer;
    }
    public static void main(String[] args) {
            System.out.println(solution(13,17));
    }
}
