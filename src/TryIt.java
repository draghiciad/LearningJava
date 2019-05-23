import java.util.Scanner;


public class TryIt {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int x, i, j, temp;

    System.out.print("Enter the size of the array: ");
    x = scan.nextInt();

    int arr[][] = new int[x][x];

    for (i = 0; i < x; i++) {
      for (j = 0; j < x; j++) {
        System.out.println("Enter array element: ");
        arr[i][j] = scan.nextInt();

      }
    }
    System.out.println("######### arr.length: " + arr.length);
    for (i = 0; i < arr.length; i++) {
      for (j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + ",");

      }

      System.out.println();
    }
    for (i=0;i<arr.length;i++) {
      for (j = 0; j < arr.length; j++) {
        for (j = i+1; j < arr.length; j++) {
          if (arr[i][j] > arr[i][j]) {
            temp = arr[i][j];
            arr[i][j] = arr[i][j];
            arr[i][j] = temp;
          }
        }
      }
    }
    for (i = 0; i < arr.length; i++) {
      for (j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + ",");
      }
      System.out.println();
    }

  }
}


