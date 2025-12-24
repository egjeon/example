public class WaterLack {
    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
            for(int i=0; i<change.length; i++){
                usage += usage*change[i] / 100;
                total_usage += usage;
                if(total_usage > storage){
                    return i;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};

        int result = solution(5141,500,change);
        System.out.println("결과 : " + result);
    }

}
