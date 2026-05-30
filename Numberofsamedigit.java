import java.util.*;

public class Numberofsamedigit {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
       
       
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
        int lastdigit = n%10;
        if(lastdigit == 5){
            count++;
        }
        n = n/10;
    }
        System.out.println(count);
    
    
}
}