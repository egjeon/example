/**  int seat = 5;   -3         -2     -3         -2                 seat  + num = 3
 * 5	[["On", "On", "On"], ["Off", "On", "-"], ["Off", "-", "-"]]	3
 * 10	[["On", "On", "On", "On", "On", "On", "On", "On", "-", "-"], ["On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"], ["On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"], ["On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"]]	0
           -1    -2    -3    -4     -5    -6   -7    -8                 -9   -10    -9    -8      -7           -9                     -10   -11  -12   -11     -12  -13   -14    -13    -12     -11     -12    -13 -12
 10 - 12  -2 = 0
 정답

 */


public class NinameRegular {

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

    public static String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }

        if(answer.length() < 3){for(int i=nickname.length()-1; i<3; i++)
            answer += "o";
        }

        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("GO"));
    }
}
