import java.util.Arrays;

public class StrArrReverse {
    public static String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            String temp = "";
            for(int j = queries[i][1]; j >= queries[i][0]; j--){
                temp += my_string.charAt(j);
            }
            my_string = my_string.substring(0,queries[i][0])+temp+my_string.substring(queries[i][1]+1);
        }

        return my_string;
    }
    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam",new int[][]{{2,3},{0,7},{5,9},{6,10}}));
    }
}
