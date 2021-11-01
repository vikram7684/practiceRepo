public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum(18,38));

        int multiply = mul(45,65);
        System.out.println(multiply);

        int divide = div(10,2);
        System.out.println(divide);
    }

    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int mul(int a, int b) {
        int mul = a*b;
        return mul;
    }

    public static int div(int a, int b) {
        int div = a/b;
        return div;
    }
}
