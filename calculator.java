import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        boolean userChoice = true;
        Double num1, num2, result;
        System.out.println("Please choose a valid operation");
        System.out.println(" Enter + for addition: ");
        System.out.println(" Enter - for subtraction: ");
        System.out.println(" Enter * for multiplication: ");
        System.out.println(" Enter / for division: ");
        operator = input.next().charAt(0);
        System.out.println("Enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        switch(operator) {
            case '+':
            result = num1 + num2;                
            System.out.println("The result is: " + result);
            break;

            case '-':
            result = num1 - num2;                
            System.out.println("The result is: " + result);
            break;

            case '*': 
            result = num1 * num2;
            System.out.println("The result is: " + result);                
            break;

            case '/':
            result = num1 / num2;
            System.out.println("The result is: " + result);
            break;

            default:
            System.out.println("Invalid operation");
        }
        input.close(); 
    }
}