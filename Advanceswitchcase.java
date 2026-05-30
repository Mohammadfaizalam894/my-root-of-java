import java.util.*;
public class Advanceswitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fruit name");
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("expensive fruit");
            case "banana" -> System.out.println("gives instant energy");
           case "melon" -> System.out.println("control dehydration");
    
  /*switch(fruit){
    case "mango,  apple,banana,melon" -> System.out.println("i like these fruits:");
    break;
    case "papaya,grapes" -> System.out.println("i like these fruits but little bit");
    break;
    default -> System.out.println("invalid choice");
    }*/



}
}
}