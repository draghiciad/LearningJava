import java.util.Scanner;

public class AverageApp {

  public static void main(String[] args) {
    int total = 0;
    int average;
    int grade;
    int counter;
    Scanner input = new Scanner(System.in);

    for (counter = 0 ;counter <10;counter++) {
      System.out.println("Enter the "+ counter+"'st number");
      grade = input.nextInt();
      total = total + grade;
         }
    average = total / counter;
    System.out.println("Total numbers averaged is "+ counter+" and all of them added are:"+total);
    System.out.println("Grade average is " + average);
  }
}