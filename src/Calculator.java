import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    double num1, num2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number:");

    num1 = scanner.nextDouble();
    System.out.print("Enter second number:");
    num2 = scanner.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    scanner.close();
    double output=0;

    if (operator == '+') {
      output = num1 + num2;
    } else if (operator == '-') {
      output = num1 - num2;
    } else if (operator == '/') {
      output = num1 / num2;
    } else if (operator == '*') {
      output = num1 * num2;
    } else {
      System.out.println("Error");
    }


    System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
  }
}