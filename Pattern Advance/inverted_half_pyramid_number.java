public class inverted_half_pyramid_number {
    
    static void rotated_half_payramid_Number(int row,int col){
    
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col-(i-1); j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        rotated_half_payramid_Number(5,5);
    }
}
