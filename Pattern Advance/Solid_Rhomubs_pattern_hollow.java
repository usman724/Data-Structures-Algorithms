public class Solid_Rhomubs_pattern_hollow {


    public static void Solid_Rhomubs_pattern_print(int row, int column){


        for (int i = 0; i < row; i++) {
            // this loop print the spaces
            for (int j = 0; j < column-i; j++) {
                System.out.print('-');   
            }   

            // Print *

            for (int j = 0; j < column; j++) {
                
                for (int j2 = 0; j2 < column; j2++) {
                    if (j==1 ||  j ==row) {
                        System.out.print('*');  
                    }
                }
            
            }   


            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Solid_Rhomubs_pattern_print(5,5);
    }
}
