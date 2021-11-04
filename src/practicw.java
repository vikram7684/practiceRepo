public class practicw {
    public static void main(String[] args) {

        String a = "not knon";
        if (a.length() > 3 && a.substring(0, 3).equals("not")) {
            System.out.println(a);
        } else {
            System.out.println("not" + a);
        }


        int num = 4;
        int factorial = 1;
        for (int i=num; i>0; i--)
        factorial = factorial * i;

        System.out.println(factorial);
    }
}





