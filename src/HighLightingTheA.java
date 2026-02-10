public class HighLightingTheA {
    public String solution(String myString) {
        myString = myString.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'a') {
                sb.append("A");
            }else{
                sb.append(myString.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new HighLightingTheA().solution("PrOgRaMmErS"));
    }
}
