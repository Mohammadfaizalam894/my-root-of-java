import java.util.*;
public class Switchcase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fruit name");
        String fruit =sc.next();

        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "melon":
                System.out.println("contro dehydration");
                break;
            case "banana":
                System.out.println(" give instant energy");
                break;
            case "apple":
                System.out.println("expensive fruit");
                break;        
                default:
                    System.out.println("please enter the valid choice");
        }
    }
    
}
