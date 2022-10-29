public class zero_one_triangle {
 
    static void zero_one_triangle_print(int row,int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i%2==0) && (j%2==0)) || ((i%2!=0) && (j%2!=0))) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        zero_one_triangle_print(5,5);
    }
}
