public class DrawArrays {
  public static void main(String[] args) {
    int i, j;
    int a[][] = new int[4][4];
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        if (i == j)
          a[i][j] = 1;
        else
          a[i][j] = 0;
      }
    }

    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) System.out.print (a[i][j] + " ");
      System.out.println();




    }
  }

}


