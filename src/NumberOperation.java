public class NumberOperation {

    public int solution(int n, String control) {
        String [] cArr = control.split("");

        for(int i = 0; i < cArr.length; i++){
            if(cArr[i].equals("w")){
                n++;
            }else if(cArr[i].equals("s")){
                n--;
            }else if(cArr[i].equals("d")){
                n +=10;
            }else if(cArr[i].equals("a")){
                n -=10;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        NumberOperation obj = new NumberOperation();
        System.out.println(obj.solution(0, "wsdawsdassw"));

    }
}
