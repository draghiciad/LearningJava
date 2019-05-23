import java.sql.SQLOutput;

public class CalculatorUnlimited {

  public static void main(String[] args) {
    System.out.println(average(2, 3, 5, 4564653, 67.55, 6));
    System.out.println(displayNrOfNumbers(1,2,3,4,5,6,7,8,9,10));
  }

  public static double average(double... numbers) {
    double total = 0;
    for (double x : numbers)
      total += x;

      return total/numbers.length;
    }


    public static int displayNrOfNumbers(int...numbers){
     int NrOfNumbers=0;
     for (int x:numbers)
       NrOfNumbers+=1;
      return NrOfNumbers;



    }


  }


