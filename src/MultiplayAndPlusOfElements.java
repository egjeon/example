public class MultiplayAndPlusOfElements {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int mult = 1;
        for(int i=0;i<num_list.length;i++){
            plus += num_list[i];
            mult *= num_list[i];
        }


        answer = plus*plus > mult ? 1 : 0;

        return answer;
    }
    public static void main(String[] args) {
        MultiplayAndPlusOfElements m = new MultiplayAndPlusOfElements();

        System.out.println(m.solution(new int[]{5, 7, 8, 3}));

    }
}
