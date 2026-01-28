public class MinimunRectangle {
    public static int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int wMax = sizes[0][0];
        int hMax = sizes[0][1];
        for(int i = 1; i < sizes.length; i++){
            wMax = Math.max(wMax, sizes[i][0]);
            hMax = Math.max(hMax, sizes[i][1]);
        }
        return wMax*hMax;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70},{60, 30}, {80, 40}}));
    }
}
