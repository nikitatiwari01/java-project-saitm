import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("-----------------------------------------------------------");
    System.out.println("-----------------------------------------------------------");
    System.out.println("------------------Percentage calculator--------------------");
    System.out.println("-----------------------------------------------------------");
    System.out.println("-----------------------------------------------------------");
    float  m1,m2,m3,m4;
      Scanner marks = new Scanner(System.in);
    System.out.println("----------------------------------------------------------");
     System.out.println("---------------------------------------------------------");
     System.out.println("------------------------Enter Marks----------------------");
     System.out.println("---------------------------------------------------------");
     System.out.println("---------------------------------------------------------");
    System.out.println("Enter Marks 1: ");
    m1 = marks.nextFloat();
    System.out.println("Enter Marks 2: ");
    m2 = marks.nextFloat();
    System.out.println("Enter Marks 3: ");
    m3 = marks.nextFloat();
    System.out.println("Enter Marks 4: ");
    m4 = marks.nextFloat();
    float p = (m1+m2+m3+m4)/4;
    System.out.println("----------------------------------------------------------");
    System.out.println("-------------------------Result---------------------------");
    System.out.println("----------------------------------------------------------");

    if(p>90 && p<=100){
      System.out.println("Your percentage is :"+p +" Your grade is A+" +" You are Pass");
    }
      else if(p>80 && p<=90){
      System.out.println("your percentage is :"+p +" Your grade is A" +" You are Pass");
      }
      else if(p>70 && p<=80){
        System.out.println("your percentage is :"+p +" Your grade is B" +" You are Pass");
      }
    else if(p>60 && p<=70){
      System.out.println("your percentage is :"+p +" Your grade is B+" +" You are Pass");
      }
    else{
      System.out.println("you are fail");
    }
  }   
  }
