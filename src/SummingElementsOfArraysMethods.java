import java.util.Scanner;

public class SummingElementsOfArraysMethods {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        int counter;
        System.out.print ("Enter the length of the array: ");
        counter = scan.nextInt ();
        int array[] = new int[counter];


        readArray (array);
        printArray (array);
        System.out.println ("The sum of the elements in the array is: " + summingElements (array));

    }

    public static void readArray(int x[]) {

        for (int i = 0; i < x.length; i++) {
            System.out.print ("Enter the " + (i + 1) + "'st number:");
            x[i] = scan.nextInt ();
        }
    }

    public static void printArray(int x[]) {
        System.out.println ();
        System.out.println ("Array elements: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print (x[i] + " ,");
        }
        System.out.println ();
    }

    public static int summingElements(int x[]) {
        int sum = 0;
        System.out.println ();
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }


}

