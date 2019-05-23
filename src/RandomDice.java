import java.util.Random;

public class RandomDice {
  public static void main(String[] args) {
    Random rand = new Random();
    int freq[] = new int[7];

    /*for (int roll=1;roll<=1000;roll++){
      ++freq[1+rand.nextInt(6)];
    }
    System.out.println("Face\tFrequency");

    for(int face=1;face<freq.length;face++){
      System.out.println(face+"\t\t"+freq[face]);
          }
     */
    /*int roll=1;
    while (roll<1000){
      ++freq[1+rand.nextInt(6)];
      roll++;}
    System.out.println("Face\tFrequency");

    int face=1;
    while (face<freq.length) {
      System.out.println(face+"\t\t"+freq[face]);
      face++;}
    System.out.println("Total number of rolls is: "+roll);
       */
    int roll = 1;
    do {
      ++freq[1 + rand.nextInt(6)];
      roll++;
    }
    while (roll < 1000);
    System.out.println("Total number of faces: " + (freq.length - 1));
    System.out.print("The frequencies are: ");

    int i;
    for (i = 1; i < freq.length; i++)
      System.out.print(freq[i] + ",");

    System.out.println(" ");
    System.out.println("Face\tFrequency");

    int face = 1;
    do {
      System.out.println(face + "\t\t" + freq[face]);
      face++;
    }
    while (face < 1000);
    System.out.println("Total number of rolls is: " + roll);
  }
}

