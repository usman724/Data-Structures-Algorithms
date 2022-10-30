public class Palindromic_pattern {
    static void  Palindromic_pattern_print(int row , int column){

        for (int i = 1; i <=row; i++) {
           
            for (int j = 1; j <=(column-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            if (i>1) {
                for (int j = 1; j <= i-1; j++) {
                    System.out.print(j+1);
                }  
            }


            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Palindromic_pattern_print(5,5);
    }
}
