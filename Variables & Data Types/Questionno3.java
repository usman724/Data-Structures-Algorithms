import java.util.Scanner;

public class Questionno3 {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Pencil Price :");
        float pencil=sc.nextFloat();
        
        System.out.println("Enter Pen Price :");
        float pen=sc.nextFloat();
        
        System.out.println("Enter Eraser Price :");
        float eraser=sc.nextFloat();

        float totalBill = pencil+pen+eraser;

        System.out.println("Total Bill : "+totalBill);


        System.out.println("Include 18% Gst Tax :" +(totalBill+(totalBill*0.18)));





        



    }

}
