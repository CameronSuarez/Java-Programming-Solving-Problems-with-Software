public class minicalculator {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println("add " + num1 + "+ " + num2 + "= " +add(num1,num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));
    }
}