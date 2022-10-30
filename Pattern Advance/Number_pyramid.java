public class Number_pyramid {

        static void  number_pattern_print(int row , int column){
    
            for (int i = 1; i <=row; i++) {
                for (int j = 1; j <=(column-i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                if (i>1) {
                    for (int j = 1; j <= i-1; j++) {
                        System.out.print(i);
                    }  
                }
                System.out.println("");
            }
    
    
        }
    
        public static void main(String[] args) {
            number_pattern_print(5,5);
        }
    
    
}
