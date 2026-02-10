public class MakeNumberOne {
    public static int solution(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            while(num_list[i] > 1){
                if(num_list[i]%2 == 0){
                    num_list[i] = num_list[i]/2;
                    answer++;
                }else {
                    num_list[i] = (num_list[i]-1)/2;
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(new int[] {12,4,15,1,14}) = " + solution(new int[]{12, 4, 15, 1, 14}));
    }
}
