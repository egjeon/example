public class BusProblem {
    /**
     * 입출력 예
     * seat	passengers	result 4명승차 2명하차  = 2,  5-2 = 3
     * 5	[["On", "On", "On"], ["Off", "On", "-"], ["Off", "-", "-"]]	3
     * 10	[["On", "On", "On", "On", "On", "On", "On", "On", "-", "-"], ["On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"], ["On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"], ["On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"]]
     * @param seat
     * @param passengers
     * @return
     */
    public  int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func3(passengers[i]);
            num_passenger -= func4(passengers[i]);
        }
        int answer =  func1(num_passenger > 0 ? func1(num_passenger) + seat : func2(num_passenger) + seat);
        return answer;
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int seat = 5;
        String [][] passenger = {{"On", "On", "On"},
                                 {"Off", "On", "-"},
                                 {"Off", "-", "-"}};

        BusProblem bp = new BusProblem();

        System.out.println(bp.solution(seat,passenger));

    }
}
