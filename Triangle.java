public class Triangle{
  public static void main(String[] args){
    String star = "*";
    
    for (int i = 0; i < 5; i++) {
      for(int j = 0; j < 5-i; j++) {
          System.out.print(" ");
      }
      for(int k = 0; k <= (i*2); k++) {
          System.out.print(star);
      }
      System.out.println("\n");
      if (i == 4){
        
        for (int a = 0; a < 5; a++) {
          for(int b = 0; b < a; b++) {
            System.out.print(" ");
            //  System.out.print(star);
          }
          for(int c = 8; c >= (a*2); c--) {
            System.out.print(star);
          }
          System.out.println("\n");
        }
      }
    }


    // for (int i = 0; i < 5; i++) {
    //   for (int j = 0; j < 5-i; j++) {
    //       System.out.print(" ");
    //   }
    //   for (int k = 0; k <= ((i-1)*2); k++) {
    //       System.out.print(star);
    //   }
    //   System.out.println("\n");
    //   if (i == 4){
    //     for (int a = 0; a < 5; a++) {
    //         for(int b = 0; b < a; b++) {
    //             System.out.print(" ");
    //           //  System.out.print(star);
    //         }
    //         for(int c = 8; c >= (a*2); c--) {
    //             System.out.print(star);
    //         }
    //         System.out.println("\n");
    //       }
    //       // for (int a = 0; a < 5; a++) {
    //       //     for(int b = 0; b < a; b++) {
    //       //         System.out.print(" ");
    //       //     }
    //       //     for(int c = 0; c <= 5*2-(a*2)-2; c++){
    //       //         System.out.print(star);
    //       //     }
    //       //     System.out.println("\n");
    //       // }
    //   }
    // }
  }
}