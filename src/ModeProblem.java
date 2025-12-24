public class ModeProblem {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        String [] arr = code.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("1")){
                if(mode == 1){
                    mode--;
                }else{
                    mode++;
                }
            }else{
                if(mode == 0){
                    if(i % 2 ==0){
                        ret.append(arr[i]);
                    }
                }
                if(mode == 1){
                    if(i % 2 != 0){
                        ret.append(arr[i]);
                    }
                }
            }
        }

        if(ret.length() == 0)ret.append("EMPTY");

        return ret.toString();
    }
    //mode는 0과 1바께없음
    // mode 0일때ㅔ ! ->
    public static void main(String[] args) {
        ModeProblem m = new ModeProblem();
        String code = "abc1abc1abc";

        System.out.println(m.solution(code));
    }
}
