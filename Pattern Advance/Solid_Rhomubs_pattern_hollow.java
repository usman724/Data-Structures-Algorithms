public class Solid_Rhomubs_pattern_hollow {


    public static void Solid_Rhomubs_pattern_print(int row, int column){


        for (int i = 1; i <= row; i++) {
            // this loop print the spaces
            for (int j = 1; j <= (column-i); j++) {
                System.out.print('-');   
            }   

            // System.out.println("row "+row+" column "+i );

            if (i==1 || i==row) {
                for (int j = 1; j <= column; j++) {
                    System.out.print('*');   
                }   
    
            } else {
                for (int j = 1; j <= column; j++) {
                    if (j==1 || j==row) {
                            System.out.print('*');   
                       } else {
                        System.out.print(' ');   
                       }  
             }
            }


            // Print *

       

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Solid_Rhomubs_pattern_print(5,5);
    }
}
