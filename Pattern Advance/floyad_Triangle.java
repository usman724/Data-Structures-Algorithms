public class floyad_Triangle {
   
    static void get_floyad_Triangle(int row, int col){
    
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+count+" ");
                count++;
            }
            System.out.println("");
        }
    }
   
    public static void main(String[] args) {
        get_floyad_Triangle(5,5);
    }
}
