public class inverted_half_pyramid {
 

    static void rotated_half_payramid(int row,int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (col-i); j++) {
                 System.out.print(" ");
              }
        
              for (int j = 1; j <= i; j++) {
                System.out.print("*");
              }

            System.out.println("");
        }



        



    }

    public static void main(String[] args) {
        rotated_half_payramid(4,4);
    }
    
}
