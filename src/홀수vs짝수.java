public class 홀수vs짝수 {
    public static int solution(int[] num_list) {
        //int [] arr = new int[num_list.length+1];
        //System.arraycopy(num_list, 0, arr, 1, num_list.length);

        int odd = 0;
        int even = 0;

        for(int i = 0; i < num_list.length; i++){
            if(i%2!=0)
                even += num_list[i];
            else
                odd += num_list[i];
        }
        return Math.max(even, odd);
    }

    public static void main(String[] args) {
            System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
    }
}
