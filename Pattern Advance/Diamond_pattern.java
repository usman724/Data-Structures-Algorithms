public class Diamond_pattern {

    static void  Diamond_pattern_print(int row , int column){

        for (int i = 1; i <=row; i++) {
           
            for (int j = 1; j <=(column-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            if (i>1) {
                for (int j = 1; j <= i-1; j++) {
                    System.out.print("*");
                }  
            }


            System.out.println("");
        }


        // Reverse  start


        for (int i = row; i >=1; i--) {
           
            for (int j = 1; j <=(column-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            if (i>1) {
                for (int j = 1; j <= i-1; j++) {
                    System.out.print("*");
                }  
            }


            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Diamond_pattern_print(10,10);
    }
}
