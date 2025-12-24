public class Test2 {

    public String getUserName(int a){
        if(a == 1){
            return "원도윤";
        }

        return "전은광";
    }

    public static void main(String[] args) {
        int a = 2;
        Test2 test2 = new Test2();
        System.out.println(test2.getUserName(1));
    }
}
