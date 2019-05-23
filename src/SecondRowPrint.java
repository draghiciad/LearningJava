class SecondRowPrint {

  public static void main(String[] args) {
    for (int j = 40; j <= 100; j++) {
      {
        if (j % 2 != 0)
          for (int i = 1; i <= 10; i++) {
            System.out.print(i * j + " ");
          }
          System.out.println();


      }

    }
  }
}

