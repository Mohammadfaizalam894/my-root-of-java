
import java.util.*;
public class LinearSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {45, 56, 65 ,74 ,35};
        System.out.println("enter the number to be search:");
        int target = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if( arr[i]== target){
                System.out.println("number found at index:"+i);
                
            }
        }
    }
    
}
