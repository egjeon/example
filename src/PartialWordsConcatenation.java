public class PartialWordsConcatenation {

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < my_strings.length; i++){
            for(int j = parts[i][0]; j <= parts[i][1]; j++){
                sb.append(my_strings[i].charAt(j));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{{0,4},{1,2},{3,5},{7,7}}));
    }
}
