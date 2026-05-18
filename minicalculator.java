import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("add " + num1 + " + " + num2 + " = " + add(num1,num2));
        System.out.println("subtract " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("multiply " + num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println("divide " + num1 + " / " + num2 + " = " + divide(num1, num2));
    }
}