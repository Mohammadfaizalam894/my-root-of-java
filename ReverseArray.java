
import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of numbers:");
        n = sc.nextInt();
        int [] arr = new int[n];
        //System.out.println("enter the numbers:");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        //int [] arr = {12, 34, 32, 21, 98, 45, 65 }; 
        reverse(arr);
        System.out.println(Arrays.toString(arr));   
        
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start ++;
            end--;
        }
    }
    
}
