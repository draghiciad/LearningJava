import java.util.Scanner;

public class SortingArraysMethod {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int x,y;

        System.out.print("Enter the first array size: ");
        x = scan.nextInt();
        int arr[] = new int[x];
        System.out.print("Enter the second array size: ");
        y = scan.nextInt();
        int arr1[] = new int[y];

        enterArrayElements(arr);
        displayArrays(arr);
        sortArrays(arr);
        displayArrays(arr);
        enterArrayElements(arr1);
        displayArrays(arr1);
        sortArrays(arr1);
        displayArrays(arr1);
    }

    public static void enterArrayElements(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array element: ");
            array[i] = scan.nextInt();
        }
    }

    public static void sortArrays(int array[]) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void displayArrays(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }


}