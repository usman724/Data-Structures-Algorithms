public class Hollow_Rectangle {


    static void hollow_patters(int row,int col){
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                
            
                if ((i==0 || j==0)||(i==col || j==col) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
       
        hollow_patters(10, 10);
     

    }
}