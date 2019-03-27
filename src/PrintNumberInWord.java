import java.util.Scanner;

public class PrintNumberInWord {
  /**
   * This is the Exercise 4
   */
  public static void main(String[] args) {
    int Q1;
    String Q2;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a integer");
    Q1 = keyboard.nextInt();
    switch(Q1) {
      case 1:
        Q2 ="one";
        break;
      case 2:
        Q2 ="two";
        break;
      case 3:
        Q2 ="three";
        break;
      case 4:
        Q2 ="four";
        break;
      case 5:
        Q2 ="five";
        break;
      case 6:
        Q2 ="six";
          break;
      case 7:
        Q2 = "seven";
        break;
      case 8:
        Q2 = "eight";
          break;
      case 9:
        Q2 = "nine";
          break;
      default:
        Q2 = "Other";
    } 
    System.out.println("The input integer is "+ Q2 );


  }
}