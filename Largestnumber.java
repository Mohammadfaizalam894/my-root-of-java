import java.util.*;

public class Largestnumber {
    public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
       
        // short cut for finding the big number
       // int max = math.max(a,b);
      // for three number 
       //int max = math.max(a,math.max(b,c))
    }
}
}
    
    

