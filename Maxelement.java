
import java.util.*;
public class Maxelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,34,54,5,32};
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
        
            
        
    }
    
    

