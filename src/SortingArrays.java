import java.util.Scanner;

public class SortingArrays {
  public static void main(String[] args) {
    int count;
    System.out.print("Enter the total numbers in the array:");
    Scanner scan = new Scanner(System.in);
    count = scan.nextInt();

    int num[] = new int[count];
    System.out.println("Enter array elements:");
    for (int i = 0; i < count; i++) {
      num[i] = scan.nextInt();
    }
    for (int i = 0; i < count; i++) {
      for (int j = i + 1; j < count; j++) {
        if (num[i] > num[j]) {
          num[i] = num[j] + num[i];
          num[j] = num[i] - num[j];
          num[i] = num[i] - num[j];
        }
      }
    }
    System.out.print("Array elements in ascending order: ");
    for (int i = 0; i < count - 1; i++) {
      System.out.print(num[i] + ",");
    }
    System.out.print(num[count - 1]);
  }
}
