import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator2 {
  public static void main(String[] args) {
    double num1, num2, result;
    char operator;

    Scanner number = new Scanner(System.in);

    System.out.print("Enter first number: ");
    num1 = number.nextDouble();
    System.out.print("Enter second number: ");
    num2 = number.nextDouble();
    System.out.print("Enter type of operation: ");
    operator = number.next().charAt(0);
    number.close();
   /* switch (o+perator) {
      case '+':
        result=num1+num2;
        System.out.println("Result is: "+ result);
        break;
      case '-':
        result=num1-num2;
        System.out.println("Result is: "+ result);
        break;
      case '*':
        result=num1*num2;
        System.out.println("Result is: "+ result);
        break;
      case '/':
        result=num1/num2;
        System.out.println("Result is: "+ result);
        break;
      default:
      System.out.println("Error");
        */



   if (operator == '+') {
      result = num1 + num2;
      System.out.println("Result is: " + result);
    } else if (operator == '-') {
      result = num1 - num2;
      System.out.println("Result is: " + result);
    } else if (operator == '/') {
      result = num1 / num2;
      System.out.println("Result is: " + result);
    } else if (operator == '*') {
      result = num1 * num2;
      System.out.println("Result is: " + result);}


    
  }
}


