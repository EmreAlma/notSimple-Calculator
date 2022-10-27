import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Double first_number;
        Double second_number;
        double result;
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
                result = first_number + second_number;
                System.out.println(first_number + "+" + second_number + "=" + result);
            }
            case '-' : {
                result = first_number - second_number;
                System.out.println(first_number + "-" + second_number + "=" + result);
            }
            case '*' : {
                result = first_number * second_number;
                System.out.println(first_number + "*" + second_number + "=" + result);
            }
            case '/' : {
                result = first_number / second_number;
                System.out.println(first_number + "/" + second_number + "=" + result);
            }
            default : System.out.println("Wrong input, please check your input and try again");
        }

    }
}
