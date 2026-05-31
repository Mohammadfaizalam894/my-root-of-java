
import java.util.*;
public class Swaparray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,34,54,5,32};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
        static void swap(int[] arr,int index1,int index3){
            int temp = arr[index1];
            arr[index1]= arr[index3];
            arr[index3]= temp;
        }
    }
    

