import java.util.Scanner;

public class HelloWorldMethod {
  public static void main(String args[]) {
    String inputText;
    //MyClass();

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter text: ");
    inputText = scan.nextLine();
    MyClass(inputText);

    //MyClass("gacsacacaml");

  }
  static void MyClass(String text) {
    System.out.println("You entered:" + text);
  }
}