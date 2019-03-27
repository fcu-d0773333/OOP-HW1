import java.util.Scanner;

class KeyboardScanner {
  /**
   * Exercise1
   */
  public static void main(String[] args) {
    int Q1;
    Float Q2;
    String Q3;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a integer");
    Q1 = keyboard.nextInt();
    System.out.println("Enter a Enter a float point number");
    Q2 = keyboard.nextFloat();
    System.out.println("Enter a you name");
    Q3 = keyboard.next();
  

    System.out.printf("Hi " + Q3 + " , the multiplication of " + Q1 + " and " + Q2 + " is  %e.",Q1*Q2 );
  }
}
  