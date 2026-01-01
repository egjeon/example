/**
 *
 *
 */
public class ConcatedNumber {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddStr = "";
        String evenStr = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evenStr += String.valueOf(num_list[i]);
            }else{
                oddStr += String.valueOf(num_list[i]);
            }
        }
        System.out.println(oddStr);
        System.out.println(evenStr);
        answer = Integer.parseInt(oddStr) + Integer.parseInt(evenStr);

        return answer;
    }

    public static void main(String[] args) {
        ConcatedNumber concatedNumber = new ConcatedNumber();
        System.out.println(concatedNumber.solution(new int[]{5, 7, 8, 3}));
    }
}
