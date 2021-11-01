public class Month {
    public static void main(String[] args) {
        String Monthname = "January";

        if (Monthname.equals("January") || Monthname.equals("March") || Monthname.equals("May") ||
                Monthname.equals("July") || Monthname.equals("August") ||
                Monthname.equals("October") || Monthname.equals("December")) {
            System.out.println("Days 31");
        } else if (Monthname.equals("April") || Monthname.equals("June") || Monthname.equals("September") ||
                Monthname.equals("November")) {
            System.out.println("Days 30");
        } else {
            System.out.println("Days 28");
        }
    }
}
