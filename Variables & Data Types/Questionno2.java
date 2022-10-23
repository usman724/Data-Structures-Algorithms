import java.util.Scanner;

public class Questionno2 {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Area : ");
        float Side = sc.nextFloat();

        // Let calculate the Area of Triangle

        float AreaofTriangle = Side*Side;

        System.out.println("Area of Triangle :"+AreaofTriangle);
    }
}
