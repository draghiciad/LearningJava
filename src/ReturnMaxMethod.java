import java.util.Scanner;

public class ReturnMaxMethod {

    public static Scanner scan = new Scanner (System.in);

    public static void main(String args[]) {
        int x, y, z;

        x = readNumber ();
        y = readNumber ();
        z = readNumber ();


        System.out.println ("Maximum number is:" + intMax (x, y, z));


    }

    public static int readNumber() {
        int number;
        System.out.print ("Enter number: ");
        number = scan.nextInt ();
        return number;
    }

    public static int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;

    }

}