import java.util.Scanner;

public class StringComparator {
  /**
   * Exercise3
   */
  public static void main(String[] args) {
    String S1, S2;
    int index;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a string 1");
    S1 = keyboard.next();
    System.out.println("Enter a string 2");
    S2 = keyboard.next();

    index = S1.compareToIgnoreCase(S2);
    if(index == 0){
        System.out.println("the two string are the same");
    }
    else {
        System.out.println("the two string are not the same");
    }

  }

}
