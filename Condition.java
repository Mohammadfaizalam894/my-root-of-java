import java.util.*;
public class Condition {
    public static void main(String[] args){
      System.out.println("enter your age");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if (age<18){
        System.out.println("You are not eligible to vote.");
       }
        else if(age <=60){
            System.out.println("you are eligible to vote");
        }
        else {
                System.out.println("you have not a right to vote");

            }
        
      
    }
}
    

