public class ReversWords {
    public static String solution(String my_string, int s, int e) {

        StringBuilder sb = new StringBuilder();

        char[] charArr = my_string.toCharArray();
        int idx = 0;

        int start = s;
        int end = e;

        for (int i = 0; i < charArr.length; i++) {
            if(idx >= start && idx <= end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;

                start++;
                end--;
            }

            sb.append(charArr[i]);
            idx++;
        }

        return sb.toString();

        /*
        StringBuilder sb = new StringBuilder();

        String tempStr = my_string.substring(s,e+1);
        for(int i = tempStr.length()-1; i >= 0; i--){
            sb.append(tempStr.charAt(i));
        }

        my_string = my_string.substring(0,s) + sb.toString() + my_string.substring(e+1);

        return my_string;*/
    }


    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3",6,12));
    }

}
