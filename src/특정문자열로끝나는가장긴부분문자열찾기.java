public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public static String solution(String myString, String pat) {
        String answer = "";
        String [] temp = pat.split("");
        String findStr = temp[pat.length()-1]; //E

        int check = myString.lastIndexOf(findStr);

        System.out.println(check);

        myString = myString.substring(0,check+1);

        return myString;
    }
    public static void main(String[] args) {
        System.out.println("solution= " + solution("AbCdEFG", "dE"));

    }


}
