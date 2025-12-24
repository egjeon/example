public class StrArrToStr {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer +=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] arr = {"a","f","b","c"};
        StrArrToStr s = new StrArrToStr();
        System.out.println(s.solution(arr));
    }
}
