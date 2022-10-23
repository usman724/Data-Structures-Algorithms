import java.util.Scanner;

/**
 * Questionno1
 */
public class Questionno1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Number ");
    int FirstNumber = sc.nextInt();


    System.out.print("Enter Second Number ");
    int SecondNumber = sc.nextInt();

    System.out.print("Enter Third Number ");
    int ThirdNumber = sc.nextInt();


    int average = FirstNumber+SecondNumber+ThirdNumber;


    System.out.print("Average  : " + (average));
  }

}