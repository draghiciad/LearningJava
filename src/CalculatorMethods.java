import java.util.Scanner;


public class CalculatorMethods {
  public static void main(String args[]) {
    char operator;
    double result = 0;
    double x = readNumber();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter type of operation: ");
    operator = input.next().charAt(0);
    double y = readNumber();
    switch (operator) {

      case ('-'):
        result = x - y;
        break;
      case ('*'):
        result = x * y;
        break;
      case ('+'):
        result = x + y;
        break;
      case ('/'):
        result = x / y;
        break;
      default:
        System.out.println("Error");
    }
    System.out.println(result);
  }

  static double readNumber() {
    double number;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number: ");
    return number = scan.nextDouble();
  }
}
