public class FindTheCosestOne{
    public static int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 0},3));
    }
}
