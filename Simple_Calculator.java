import java.util.*;
public class Main {
  public static void main(String[] args) {
    System.out.println("-------------------------");
    System.out.println("Simple Calculator");
    System.out.println("-------------------------");
    float m1,m2;
    Scanner marks = new Scanner(System.in);
    String choice;

    while(true){
      System.out.print("Enter your Num1:");
      m1 = marks.nextFloat();
      System.out.print("Enter your Num2:");
      m2 = marks.nextFloat();
      System.out.println("Choose operation:");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. Division (/)");
      System.out.println("5. Exit");
      System.out.print("Enter your choice (1-4): ");
      int operation = marks.nextInt();
      double result = 0;
      if (operation == 1) {
          result = m1 + m2;
      } else if (operation == 2) {
          result = m1 - m2;
      } else if (operation == 3) {
          result = m1 * m2;
      } else if (operation == 4) {
          if (m2 != 0) {
              result = m1 / m2;
          } else {
              System.out.println("Cannot divide by zero. Please try again.");

          }
      }else if(operation == 5){
            break;
        }
      else {
          System.out.println("Invalid choice. Please enter a number between 1 and 4.");

      }
      System.out.println("Result :- " + result);
      System.out.print("Want to Continue yes[1] : NO[0]) = ");
      int operation2 = marks.nextInt();
      if(operation2 == 0){
        break;
      }
      
    }
  }
}