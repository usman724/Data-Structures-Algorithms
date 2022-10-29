public class butterfly_pattern {


    public static void butterfly_pattern_print(int row, int column){

        // Top 
        for (int i = 1; i <= row; i++) {
            
            // Print the *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces 
            for (int j = 1; j <= row-i; j++) {
                System.out.print("-");
            }

              // Print spaces 
              for (int j = 1; j <= row-i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println(" ");
        }





                // Bottom 
                for (int i = row; i > 0; i--) {
            
                    // Print the *
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Print spaces 
                    for (int j = 1; j <= row-i; j++) {
                        System.out.print("-");
                    }
        
                      // Print spaces 
                      for (int j = 1; j <= row-i; j++) {
                        System.out.print("-");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                     System.out.println(" ");
                }
        

    }

    public static void main(String[] args) {
        butterfly_pattern_print(4,4);
    }
}
