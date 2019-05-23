import java.util.Scanner;

public class SumMethod {
  public static void main(String args[]) {
    Scanner scan=new Scanner(System.in);
    int x,y;
    System.out.print("Enter the first number: ");
    x=scan.nextInt();
    System.out.print("Enter the second number: ");
    y=scan.nextInt();


    System.out.println("Sum of the numbers is: "+SumDouble(x,y));



  }

  public static int SumDouble(int a, int b) {
    int sum = a + b;
    if (a == b) {
      sum = sum * 2;
    }
    return sum;
  }

}
