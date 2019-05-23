import java.util.Scanner;


public class ReadDisplayArraysMethods {
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int fstarray[][];
    int scdarray[][];
    int arrayR1, arrayR2, arrayC1, arrayC2;

    System.out.print("Enter the first array row length: ");
    arrayR1 = scan.nextInt();
    System.out.print("Enter the first array column length: ");
    arrayC1 = scan.nextInt();
    System.out.print("Enter the second array row length: ");
    arrayR2 = scan.nextInt();
    System.out.print("Enter the second array column length: ");
    arrayC2 = scan.nextInt();
    fstarray = new int[arrayR1][arrayC1];
    scdarray = new int[arrayR2][arrayC2];


  /*  for (int row = 0; row < arrayR1; row++) {
      for (int col = 0; col < arrayC1; col++) {
        fstarray[row][col] = scan.nextInt();
      }
    }
    for (int row = 0; row < arrayR2; row++) {
      for (int col = 0; col < arrayC2; col++) {
        scdarray[row][col] = scan.nextInt();
      }
    }

*/
    enterElements(fstarray);
    enterElements(scdarray);


    System.out.println("This is the first array:");
    display(fstarray);
    System.out.println("This is the second array:");
    display(scdarray);
  }

  private static void display(int x[][]) {
    for (int row = 0; row < x.length; row++) {
      for (int col = 0; col < x[row].length; col++) {
        System.out.print(x[row][col] + "\t");
      }
      System.out.println();
    }
  }

   static void enterElements(int x[][]) {
    System.out.println("Enter the elements of the " + x + "'st array.");
    for (int row = 0; row < x.length; row++) {
      for (int col = 0; col < x[row].length; col++) {
        System.out.print("Enter the number from the row " + (row + 1) + " and the column " + (col + 1) + ": ");
        x[row][col] = scan.nextInt();
      }
    }
  }
}

