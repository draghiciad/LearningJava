import java.util.Scanner;

public class SortingLettersMethod {
    public static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {
        int x;

        System.out.println ("Enter array length: ");
        x=scan.nextInt ();
        char letter[] = new char[x];
        enterArrays (letter);
        displayArrays (letter);
        sortingArrays (letter);
        displayArrays (letter);
    }

    public static void enterArrays(char array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print ("Enter array element: ");
            array[i] = scan.next ().charAt (0);
        }

    }

    public static void displayArrays(char array[]) {
        System.out.print ("Array elements in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + ",");
        }
        System.out.println ();
    }

    public static void sortingArrays(char array[]) {
        char temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

