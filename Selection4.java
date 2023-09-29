import java.util.Scanner;

/**
 * Selection4
 */
public class Selection4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, number3, result;
        char operator;
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        number3 = input.nextDouble();
        System.out.print("Enter an operator (+ - * /): ");
        operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                result = number1 + number2 + number3;
                System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + result);
                break;
        case '-':
        result = number1 - number2 - number3;
        System.out.println(number1 + " - " + number2 + " - " + number3 + " = " + result);
        break;
        case '*':
        result = number1 * number2 * number3;
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + result);
        break;
        case '/':
        result = number1 / number2 / number3;
        System.out.println(number1 + " / " + number2 + "/" + number3 + " = " + result);
        break;
                default:
                System.out.println("The operator you entered is wrong");
   
            }
        }
}