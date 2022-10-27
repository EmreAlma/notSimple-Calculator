import java.util.Scanner;

public class Main {

    public static double addition (double x, double y){
        return x + y;
    }
    public static double subtraction (double x, double y){
        return x - y;
    }
    public static double multiply (double x, double y){
        return x * y;
    }
    public static double divide (double x, double y){
        return x / y;
    }
    public static void main(String[] args) {
        double first_number, second_number;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number");
        first_number = input.nextDouble();

        System.out.println("Please choose an operation");
        operator = input.next().charAt(0);

        System.out.println("Please choose second number");
        second_number = input.nextDouble();

        switch (operator) {
            case '+':  {
                System.out.println(addition(first_number, second_number));
                break;
            }
            case '-' : {
                System.out.println(subtraction(first_number, second_number));
                break;
            }
            case '*' : {
                System.out.println(multiply(first_number, second_number));
                break;
            }
            case '/' : {
                System.out.println(divide(first_number, second_number));
                break;
            }
            default : System.out.println("Wrong input, please check your input and try again");
        }

    }
}
