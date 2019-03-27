import java.util.Scanner;

class CheckOddEven {
  /**
   * Exercise2
   */
  public static void main(String[] args) {
    int Q1;
    String Q2;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a integer");
    Q1 = keyboard.nextInt();
    if(Q1%2 == 0)
      Q2 = "Even Number";
    else
      Q2 = "Odd Number";
    System.out.println("The input integer is "+ Q2);
    

  }
}